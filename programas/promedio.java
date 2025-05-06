package programas;

import java.util.Scanner;

public class promedio {
    
    public static void promedio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("seleccione el primer numero ");
        int num11 = scanner.nextInt();

 
        System.out.println("seleccione el segundo numero ");
        int num12 = scanner.nextInt();

        System.out.println("seleccione el tercer numero ");
        int num13 = scanner.nextInt();


        double resultado= (num11+num12+num13)/3;
        System.out.println("| su resultado es " + resultado); 
    }
}
