package ikea;

import java.util.Arrays;

public class Tienda {
    private Producto[] listaProducto;

    public Tienda(Producto[] listaProductos) {
        this.listaProducto = listaProductos;
    }
    
    
    void AgregarProducto(){
        listaProducto=Arrays.copyOf(listaProducto, listaProducto.length+1);
        listaProducto [listaProducto.length-1]=Producto;
    }
    
    void mostratProducto(){
        
    }
}
