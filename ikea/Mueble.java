package ikea;

public class Mueble extends ProductoHogar{
    TipoMueble tipo;

    Mueble(){
    }
    public Mueble(TipoMueble tipo, String nombre, String desc, Double precio) {
        super(nombre, desc, precio);
        this.tipo = tipo;
    }

    public TipoMueble getTipo() {
        return tipo;
    }

    public void setTipo(TipoMueble tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mueble{" + "tipo=" + tipo + '}';
    }
    
    
}
