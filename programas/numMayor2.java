package programas;

import java.util.Scanner;

public class numMayor2 {
    public static void numMayor2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("seleccione el primer numero ");
                    int num16 = scanner.nextInt();

                    System.out.println("seleccione el segundo numero ");
                    int num17 = scanner.nextInt();

                    System.out.println("seleccione el tercer numero ");
                    int num18 = scanner.nextInt();

                    if (num16 > num17 && num18 <num16) {
                        System.out.println("El numero mayor es " + num16);
                    
                    }

                    if (num17 > num16 && num18 <num17) {
                        System.out.println("El numero mayor es " + num17);
                    }

                    else {
                        System.out.println("El numero mayor es " + num18);
                    }
    }
}
