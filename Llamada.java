package llamada;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Llamada {
    int num_cliente;
    int num_interlocutor; 
    boolean saliente;
    LocalDateTime inicio;
    LocalDateTime fin;
    enum Zonas{
        zon1, zon2, zon3, zon4, zon5
    }
    Zonas zona;
    double tabla[]={5, 3, 4, 5.3, 3.6};
    
    Llamada(){
    }

    public Llamada(int num_cliente, int num_interlocutor, boolean saliente, LocalDateTime inicio, LocalDateTime fin) {
        this.num_cliente = num_cliente;
        this.num_interlocutor = num_interlocutor;
        this.saliente = saliente;
        this.inicio = inicio;
        this.fin = fin;
    }
    
    long duracion(){
        return inicio.until(fin, ChronoUnit.MINUTES);
    }
    
    double tarifa(){
        double total = 0;
        double se;
        if (!saliente){
            total=0;
        }else{
            switch(zona){
                case zon1:
                    total=tabla[0]*duracion();
                    break;
                case zon2:
                    total=tabla[1]*duracion();
                    break;
                case zon3:
                    total=tabla[2]*duracion();
                    break;
                case zon4:
                    total=tabla[3]*duracion();
                    break;
                case zon5:
                    total=tabla[4]*duracion();
                    break;
            }
        }
        return total;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public int getNum_interlocutor() {
        return num_interlocutor;
    }

    public void setNum_interlocutor(int num_interlocutor) {
        this.num_interlocutor = num_interlocutor;
    }

    public boolean isSaliente() {
        return saliente;
    }

    public void setSaliente(boolean saliente) {
        this.saliente = saliente;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public Zonas getZona() {
        return zona;
    }

    public void setZona(Zonas zona) {
        this.zona = zona;
    }

    public double[] getTabla() {
        return tabla;
    }

    public void setTabla(double[] tabla) {
        this.tabla = tabla;
    }

    @Override
    public String toString() {
        return "Llamada{" + "num_cliente=" + num_cliente + ", num_interlocutor=" + num_interlocutor + ", saliente=" + saliente + ", inicio=" + inicio + ", fin=" + fin + ", zona=" + zona + ", tabla=" + tabla + '}';
    }
    
    
    
}
