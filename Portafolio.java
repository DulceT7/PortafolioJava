import java.util.Scanner;

public class Portafolio {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println();
            System.out.println("     _       _          ");
            System.out.println("  __| |_   _| | ___ ___ ");
            System.out.println(" / _` | | | | |/ __/ _ \\");
            System.out.println("| (_| | |_| | | (_|  __/");
            System.out.println(" \\__,_|\\__,_|_|\\___\\___|");
            System.out.println();

            System.out.println("[?] Selecciona una opción para continuar");
            System.out.println("------> Desarrollado por Dulce 2025");
            System.out.println("");

            // Menú
            System.out.println("| [1] La suma de dos números ");
            System.out.println("| [2] Opción 2 ");
            System.out.println("| [3] Opción 3 ");
            System.out.println("| [4] Opción 4 ");
            System.out.println("| [0] Salir ");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();

            // Opciones
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int num2 = scanner.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break; // Se agregó para evitar que siga ejecutando los otros casos
                
                case 2:
                    System.out.println("Opción 2 seleccionada.");
                    break;

                case 3:
                    System.out.println("Opción 3 seleccionada.");
                    break;

                case 4:
                    System.out.println("Opción 4 seleccionada.");
                    break;

                case 5:
                    System.out.println("Saliendo del programa");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 5);
    }
}
