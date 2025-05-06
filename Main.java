import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        vistas.vista.banner();
        do {

            

            // Menú
            programas.Opciones.opciones();
            System.out.println(" [0] Salir ");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();

            // Opciones
            switch (opcion) {
                case 1:
                    System.out.println("---------------->");
                    programas.sumar.suma();
                    System.out.println("---------------->");
                    break; 
                
                case 2:
                    System.out.println("----------------->");
                    programas.resta.resta();
                    System.out.println("----------------->");
                    break;

                case 3:
                    System.out.println("------------------>");
                    programas.multiplicacion.multiplicar();
                    System.out.println("------------------>");
                    break;

                case 4:
                    System.out.println("------------------>");
                    programas.division.dividir();
                    System.out.println("------------------>");
                    break;

                case 5:
                    System.out.println("------------------>");
                    programas.modulo.modulo();
                    System.out.println("------------------>");
                    break;

                case 6:
                    System.out.println("------------------>");
                    programas.promedio.promedio();
                    System.out.println("------------------>");
                    break;

                case 7:
                    System.out.println("------------------>");
                    programas.numMayor.numMayor();
                    System.out.println("------------------>");
                    break;

                case 8:
                    System.out.println("------------------>");
                    programas.numMayor2.numMayor2();
                    System.out.println("------------------>");
                    break;
                
                case 9:
                    System.out.println("------------------>");
                    programas.metros.metros();
                    System.out.println("------------------>");
                    break;

                case 10:
                    System.out.println("------------------>");
                    programas.kilogramos.kilogramos();
                    System.out.println("------------------>");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }
}
