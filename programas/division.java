package programas;

import java.util.Scanner;

public class division {

    public static void dividir(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero ");
            int num7 = scanner.nextInt();
    
            System.out.println("ingrese el segundo numero ");
            int num8 = scanner.nextInt();
    
            double division= num7/num8;
            System.out.println("| [ Resultado ]: " + division);
    }
    
}
