package programas;

import java.util.Scanner;

public class resta {
    
    public static void resta(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int num3 = scanner.nextInt();

        System.out.println("ingrese el segundo numero: ");
        int num4 = scanner.nextInt();

        double resta= num3-num4;
        System.out.println("| [ Resultado ]: " + resta);
    }
}
