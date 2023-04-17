package socio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Serializable;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class Socio implements Serializable, Comparable{

    String dni;
    String nombre;
    LocalDate fechaAlta;

    Socio() {

    }

    public Socio(String dni, String nombre, LocalDate fechaAlta) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    @Override
    public boolean equals(Object obj) {
        Socio otro = (Socio) obj;
        boolean dni = false;
        boolean res;
        if (this.dni.equals(otro.dni)) {
            res = false;
        } else {
            res = true;
        }
        return res;
    }

    long Antigüedad() {
        long res;
        res = DAYS.between(fechaAlta, LocalDate.now());
        return res;
    }

    void escribir() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("socios.dat", true));
            String cont;
            cont=this.toString();
            bw.write(cont);
            bw.newLine();
            bw.flush();
            bw.close();
        } catch (Exception e) {
        }
    }

    @Override
    public String toString() {
        return "Socio{" + "dni=" + dni + ", nombre=" + nombre + ", fechaAlta=" + fechaAlta + '}';
    }

    @Override
    public int compareTo(Object o) {
        int res=dni.compareTo(((Socio)o).dni);
        if (res==0){
            res= (int) (Antigüedad()-(((Socio)o).Antigüedad()));
        }
        return res;
    }
    
    

}
