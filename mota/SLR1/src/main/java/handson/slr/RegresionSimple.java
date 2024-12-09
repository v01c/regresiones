
package handson.slr;

/**
 *
 * @author Benavides
 */
public class RegresionSimple {

    // Constructor
    public RegresionSimple() {
            }

    public void calcularRegresionSimple() {//3
        double[] advertising = Data.advertising; 
        double[] sales = Data.sales; 

        //BETA01//2
        double beta1 = calcularBeta1(advertising, sales);
        double beta0 = calcularBeta0(advertising, sales, beta1);

        // CURVBA REGRESION
        System.out.printf("Curva de Regresion Lineal: Y = B0 %.2f + B1 %.2f*X%n", beta0, beta1);

        // HACER PREDICCIONES
        realizarPredicciones(beta0, beta1);
    }

    private double calcularBeta1(double[] x, double[] y) {//6
        double sumaXY = Mate.sumXY(x, y);
        double sumaX = Mate.sumX(x);
        double sumaY = Mate.sumY(y);
        double sumaX2 = Mate.sumX2(x);
        double n = Mate.numeroD(x);

        // FORMULA BETA1
        return (n * sumaXY - sumaX * sumaY) / (n * sumaX2 - sumaX * sumaX);
    }

    private double calcularBeta0(double[] x, double[] y, double beta1) {//4
        double sumaY = Mate.sumY(y);
        double sumaX = Mate.sumX(x);
        double n = Mate.numeroD(x);

        //BETA0 
        return (sumaY - beta1 * sumaX ) / n;
    }

    private void realizarPredicciones(double beta0, double beta1) {//5
        double[] valoresConocidos = {108, 115, 106, 97, 95, 91, 97, 83, 83, 78}; //VALORES A PREDECIR
        for (double valor : valoresConocidos) {
            double prediccion = beta0 + (beta1 * valor);
            System.out.printf("Prediccion para X = %.2f: Y = %.2f%n", valor, prediccion);
        }
    }
}
