package programas;

import java.util.Scanner;

public class sumar {

    public static void suma() {
        Scanner scannernum = new Scanner(System.in);
        System.out.print("[n1]: ");
        double n1 =scannernum.nextDouble();

        System.out.print("[n1]: ");
        double n2 =scannernum.nextDouble();

        System.out.print("[Re]: " + (n1 + n2));
    }
}
