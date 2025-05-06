package programas;

import java.util.Scanner;

public class metros {
    public static void metros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("metros: ");
        int metros = scanner.nextInt();

        double Centimetros= metros*100;
        System.out.println("| el resultado es " + Centimetros);
    }
}
