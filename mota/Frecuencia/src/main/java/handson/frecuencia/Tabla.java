
package handson.frecuencia;



import java.util.ArrayList;

/**
 * Clase que realiza los cálculos de frecuencias y muestra los resultados.
 */
public class Tabla {
    private ArrayList<Double> limitesInferiores = new ArrayList<>();
    private ArrayList<Double> limitesSuperiores = new ArrayList<>();
    private ArrayList<Double> puntosMedios = new ArrayList<>();
    private ArrayList<Integer> frecuencias = new ArrayList<>();
    private ArrayList<Integer> frecuenciasAcumuladas = new ArrayList<>();
    private ArrayList<Double> frecuenciasRelativas = new ArrayList<>();
    private ArrayList<Double> porcentajes = new ArrayList<>();
    private int totalDatos;

    // Constructor: Realiza todos los cálculos necesarios para las frecuencias.
    public Tabla(Data data) {
        ArrayList<Double> datos = data.getDatos();
        totalDatos = data.getSize();
        double min = data.getMin();
        double max = data.getMax();

        // Cálculo del rango, clases y ancho de clase.
        double rango = Mate.calcularRango(min, max);
        int k = Mate.calcularClases(totalDatos);
        double anchoClase = Mate.calcularAnchoClase(rango, k);

        int fa = 0; // Inicialización de frecuencia acumulada.

        // Construcción de las frecuencias y otros valores.
        for (int i = 0; i < k; i++) {
            double li = min + i * anchoClase; // Límite inferior.
            double ls = li + anchoClase;     // Límite superior.

            limitesInferiores.add(li);
            limitesSuperiores.add(ls);
            puntosMedios.add(Mate.calcularPuntoMedio(li, ls));

            // Contar frecuencia de datos en esta clase.
            int frecuencia = 0;
            for (double dato : datos) {
                if (dato >= li && dato < ls) {
                    frecuencia++;
                }
            }
            frecuencias.add(frecuencia);

            // Frecuencia acumulada.
            fa += frecuencia;
            frecuenciasAcumuladas.add(fa);

            // Frecuencia relativa y porcentaje.
            double fr = Mate.calcularFrecuenciaRelativa(frecuencia, totalDatos);
            frecuenciasRelativas.add(fr);
            porcentajes.add(Mate.calcularPorcentaje(fr));
        }
    }

    // Método para imprimir los resultados de las frecuencias.
    public void imprimirRenglones() {
        for (int i = 0; i < limitesInferiores.size(); i++) {
            System.out.println("Clase " + (i + 1));
            System.out.println("Limite inferior: " + limitesInferiores.get(i));
            System.out.println("Limite superior: " + limitesSuperiores.get(i));
            System.out.println("Frecuencia: " + frecuencias.get(i));
            System.out.println("Punto medio: " + puntosMedios.get(i));
            System.out.println("Frecuencia acumulada: " + frecuenciasAcumuladas.get(i));
            System.out.println("Frecuencia relativa: " + frecuenciasRelativas.get(i));
            System.out.println("Porcentaje: " + porcentajes.get(i) + "%");
            System.out.println("---------------------------------");
        }
        System.out.println("Total de datos (n): " + totalDatos);
    }
}