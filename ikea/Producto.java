package ikea;

public abstract class Producto {
    String nombre;
    String desc;
    Double precio;
    
    Producto(){
    }
    public Producto(String nombre, String desc, Double precio) {
        this.nombre = nombre;
        this.desc = desc;
        this.precio = precio;
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
    
}
