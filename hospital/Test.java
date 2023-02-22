package hospital;

public class Test {
    public static void main(String[] args) {
       Medico m=new Medico("Manuel", 342, 1500, 5, 10, EnumM.cardiologo);
        No_Medico nm=new No_Medico("Cristina", 485, 1300, EnumNM.recepcionistas, "Recepción"); 
        System.out.println(m);
        System.out.println(nm);
    }
}
