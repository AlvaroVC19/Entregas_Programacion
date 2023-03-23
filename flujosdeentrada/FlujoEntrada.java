package flujosdeentrada;

import java.io.*;

public class FlujoEntrada {
    FileReader in;
    
    public FlujoEntrada() throws FileNotFoundException {
        this.in = new FileReader("C:\\Users\\avill\\Desktop\\Trabajos_ciclo\\FlujoTexto.txt");
    }
    
}
