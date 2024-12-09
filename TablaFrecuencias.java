import java.util.Scanner;

public class TablaFrecuencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[100]; 
        int[] frecuencias = new int[100];
        int cantidadNumeros = 0;

        System.out.println("Ingrese sus datos separados por un espacio:");
        String[] input = scanner.nextLine().split(" ");

//convierte de string a num 
        for (String num : input) {
            int numero = Integer.parseInt(num);
            boolean encontrado = false;

            // recorre un indice hazta la cantidad de numeros, si lo encuentra aumenta la frecuencia y marca true
            for (int i = 0; i < cantidadNumeros; i++) {
                if (numeros[i] == numero) {
                    frecuencias[i]++;
                    encontrado = true;
                    break;
                }
            }

            // si no lo encuentra registra el numero nuevo y le da la frecuencia 1 
            if (!encontrado) {
                numeros[cantidadNumeros] = numero;
                frecuencias[cantidadNumeros] = 1;
                cantidadNumeros++;
            }
        }


        int totalNumeros = input.length;

        // Mostrar tabla de frecuencias
        System.out.printf("%-10s %-15s %-15s %-10s\n", "Numero", "Frecuencia", "Frecuencia Relativa", "     Porcentaje");
        for (int i = 0; i < cantidadNumeros; i++) {
            double frecuenciaRelativa = (double) frecuencias[i] / totalNumeros;
            double porcentaje = frecuenciaRelativa * 100;
            System.out.printf("%-10d %-15d %-15.2f %-10.2f%%\n", numeros[i], frecuencias[i], frecuenciaRelativa, porcentaje);
        }

        scanner.close();
    }
}
