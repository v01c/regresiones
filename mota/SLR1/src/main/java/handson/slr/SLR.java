

package handson.slr;

/**
 *
 * @author Benavides
 */
import java.util.Scanner;    //5
public class SLR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        //MENU TIPO REGRESION  //7
          do { 
            System.out.println("Elija el tipo de regresion que desea calcular:");
            System.out.println("1. Regresion Lineal Simple");
            System.out.println("2. Regresion Cuadratica");
            System.out.println("3. Salir");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) { //19
                case 1:                 
                   //instancia regresion simple
                    RegresionSimple regresionSimple = new RegresionSimple();
                    // llamar metodoregresion simple
                    regresionSimple.calcularRegresionSimple();
                    break;
                case 2:
                    // instancia regresion cuadrática
                    RegresionCuadratica regresionCuadratica = new RegresionCuadratica();
                    //llamar metodo
                    regresionCuadratica.calcularRegresionCuadratica();
                            
                    break;
                case 3:
                    System.out.println("Saliendo... bye");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }

            System.out.println();

        } while (opcion != 3);

        scanner.close(); // Cerrar el scanner
    }
        
        
}