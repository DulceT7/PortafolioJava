package programas;

import java.util.Scanner;

public class modulo {
    
    public static void modulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
        int num9 = scanner.nextInt();

        System.out.println("ingrese el segundo numero ");
        int num10 = scanner.nextInt();

        double modulo= num9%num10;
        System.out.println("| [ Resultado ]: " + modulo);
    }
}
