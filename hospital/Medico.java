package hospital;

public class Medico extends Trabajador {
    int colegiado;
    int pacientes;
    EnumM EnumMe;

    Medico(){
    }
    public Medico(String nombre, int id, double sueldo, int colegiado, int pacientes, EnumM enumMe) {
        super(nombre, id, sueldo);
        this.colegiado = colegiado;
        this.pacientes = pacientes;
        EnumMe = enumMe;
    }

    public int getColegiado() {
        return colegiado;
    }

    public void setColegiado(int colegiado) {
        this.colegiado = colegiado;
    }

    public int getPacientes() {
        return pacientes;
    }

    public void setPacientes(int pacientes) {
        this.pacientes = pacientes;
    }

    public EnumM getEnumMe() {
        return EnumMe;
    }

    public void setEnumMe(EnumM EnumMe) {
        this.EnumMe = EnumMe;
    }

    @Override
    public String toString() {
        return "Medico="+nombre+" [sueldo="+sueldo+"€, id="+id+", colegiado=" + colegiado + ", pacientes=" + pacientes + ", EnumMe=" + EnumMe + "]";
    }
}
