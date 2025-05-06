package programas;

public class Opciones {

    static String lista [] = {
        "Suma de dos números",
        "La resta de dos Numeros",
        "Multiplicacion de dos Numeros",
        "Division de dos Numeros",
        "Módulo (Residuo de una división)",
        " Promedio de tres números",
        "Número mayor y menor entre dos números",
        "Número mayor y menor entre tres números",
        "Conversión de metros a centímetros",
        " Conversión de kilogramos a gramos",

    
    };

    //MOSTAR OPCIONES

    public static void opciones(){

        for (int i = 0; i < lista.length; i++) {
            System.out.println("["+ (i + 1) + "]" + lista[i]);
        }
    }
} 