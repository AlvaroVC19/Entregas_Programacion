package flujosdeentrada;

import java.util.Locale;
import java.util.Scanner;

public class Escan {
    public static void escane(){
        Scanner sc =new Scanner (System. in) . useLocale (Locale.US);
        System.out.println("Escribe el nombre, la edad y estatura");
        String nombre=sc.next();
        int edad=sc.nextInt();
        double estat=sc.nextDouble();
        
        System.out.println("Nombre: "+nombre+" Edad: "+edad+" Estatura: "+estat);
    }
}
