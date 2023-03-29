package flujosalida;

import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class FlujoEjercicio{
    public static void main(String[] args){
        try {
            BufferedWriter flux=new BufferedWriter(new FileWriter("Flujo.txt"));
            BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            String texto;
            do{
                System.out.print("Escribe texto hasta que pongas 'fin' para terminar: ");
                texto=reader.readLine();

                if (!"fin".equals(texto)){
                    flux.write(texto);
                    flux.newLine();
                }
            } while (!"fin".equals(texto));

            flux.close();
        } catch(IOException ae){
            System.out.println("Error: "+ae.getMessage());
        }
    }
}
