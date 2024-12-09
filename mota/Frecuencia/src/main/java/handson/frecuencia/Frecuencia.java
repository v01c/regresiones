package handson.frecuencia;
import java.util.Scanner;

/**
 * Clase principal que controla el menú del programa.
 */
public class Frecuencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Mostrar menú.
            System.out.println("Menu de opciones:");
            System.out.println("1. Calcular frecuencias");
            System.out.println("2. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                // Crea el dataset y realiza los cálculos de frecuencias.
                Data data = new Data();
                Tabla tabla = new Tabla(data);
                tabla.imprimirRenglones();
            } else if (opcion == 2) {
                // Salir del programa.
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opcion inválida. Intenta de nuevo.");
            }
        }
    }
}
