package socio;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        Socio s=new Socio("21468636T", "Marta", LocalDate.of(2023, Month.MARCH, 17));
        
        System.out.println(s.Antigüedad()+" días");
        s.escribir();
        System.out.println("Eliga el numero de su opcion:");
        System.out.println("1. Alta");
        System.out.println("2. Baja");
        System.out.println("3. Modificación");
        System.out.println("4. Listado por DNI");
        System.out.println("5. Listado por antigüedad");
        System.out.println("6. Salir");
        n=sc.nextInt();
        
        switch (n){
            case 1:
                
                break;
                
            case 2:
                
                break;
                
            case 3:
                
                break;
                
            case 4:
                
                break;
                
            case 5:
                
                break;
                
            case 6:
                
                break;
        }
    }
    
}
