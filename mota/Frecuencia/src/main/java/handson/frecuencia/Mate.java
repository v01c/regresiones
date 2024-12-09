
package handson.frecuencia;


/**
 * Clase con métodos matemáticos para calcular valores relacionados con frecuencias.
 */
public class Mate {

    // Calcula el número de clases usando la regla de Sturges.
    public static int calcularClases(int n) {
        return (int) Math.ceil(1 + 3.322 * Math.log10(n));
    }

    // Calcula el rango del dataset.
    public static double calcularRango(double min, double max) {
        return max - min;
    }

    // Calcula el ancho de las clases.
    public static double calcularAnchoClase(double rango, int k) {
        return Math.ceil(rango / k);
    }

    // Calcula el punto medio entre dos valores.
    public static double calcularPuntoMedio(double li, double ls) {
        return (li + ls) / 2;
    }

    // Calcula la frecuencia relativa.
    public static double calcularFrecuenciaRelativa(int frecuencia, int total) {
        return (double) frecuencia / total;
    }

    // Calcula el porcentaje a partir de la frecuencia relativa.
    public static double calcularPorcentaje(double frecuenciaRelativa) {
        return frecuenciaRelativa * 100;
    }
}