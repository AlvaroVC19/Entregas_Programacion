package ikea;

public class Electrodomestico extends ProductoHogar{
    EficienciaEnergetica energia;

    Electrodomestico(){
    }
    public Electrodomestico(EficienciaEnergetica energia, String nombre, String desc, Double precio) {
        super(nombre, desc, precio);
        this.energia = energia;
    }

    public EficienciaEnergetica getEnergia() {
        return energia;
    }

    public void setEnergia(EficienciaEnergetica energia) {
        this.energia = energia;
    }
    
    
}
