package hospital;

public class No_Medico extends Trabajador {
    EnumNM noEsp;
    String area;

    No_Medico(){
    }
    
    public No_Medico(String nombre, int id, double sueldo, EnumNM noEsp, String area) {
        super(nombre, id, sueldo);
        this.noEsp = noEsp;
        this.area = area;
    }

    public EnumNM getNoEsp() {
        return noEsp;
    }

    public void setNoEsp(EnumNM noEsp) {
        this.noEsp = noEsp;
    }

    public String getAreas() {
        return area;
    }

    public void setAreas(String areas) {
        this.area = areas;
    }

    @Override
    public String toString() {
        return "No_Medico="+nombre+" [sueldo="+sueldo+"€, id="+id+", noEsp=" + noEsp + ", area=" + area + "]";
    }
}
