package programas;

import java.util.Scanner;

public class numMayor {
    public static void numMayor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("seleccione el primer numero ");
                    int num14 = scanner.nextInt();

                    System.out.println("seleccione el segundo numero ");
                    int num15 = scanner.nextInt();

                    if (num14 > num15) {
                        System.out.println("El numero mayor es " + num14);
                        
                    }
                    else {
                        System.out.println("El numero mayor es " +num15);
                        
                    }
    }
}
