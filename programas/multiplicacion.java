package programas;

import java.util.Scanner;

public class multiplicacion {
    
    public static void multiplicar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
            int num5 = scanner.nextInt();
    
            System.out.println("ingrese el segundo numero ");
            int num6 = scanner.nextInt();
    
            double multiplicacion= num5*num6;
            System.out.println("| [ Resultado ]: " + multiplicacion);

    }
}
