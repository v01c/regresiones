
package handson.slr;

/**
 *
 * @author Benavides
 */
public class RegresionCuadratica {

    // Constructor
    public RegresionCuadratica() { //1
        
    }

    public void calcularRegresionCuadratica() { //3
        double[] advertising = Data.advertising; //datos de advertising
        double[] sales = Data.sales; // datos de sales

    double n = Mate.numeroD(advertising);
    double sumaX = Mate.sumX(advertising);
    double sumaX2 = Mate.sumX2(advertising);
    double sumaX3 = Mate.sumX3(advertising);
    double sumaX4 = Mate.sumX4(advertising);
 
    // Crear matriz del sistema
    double[][] matriz = {
        {n, sumaX, sumaX2},
        {sumaX, sumaX2, sumaX3},
        {sumaX2, sumaX3, sumaX4}
    };

    // Resolver el sistema de ecuaciones
    double[] coeficientes = Mate.resolverSistema(matriz);

    // Coeficientes A, B y C
    double A = coeficientes[0];
    double B = coeficientes[1];
    double C = coeficientes[2];

        // mostrar la curva de regresion//1
        System.out.printf("Curva de Regresin Cuadratica: Y = B0 %.4f + B1 %.4f*X + B2 %.4f*X^2%n", A, B, C);

        // hacer predicciones
        realizarPredicciones(A, B, C);//1
    }


    private void realizarPredicciones(double A, double B, double C) {//5
        double[] valoresConocidos = {108, 115, 106, 97, 95, 91, 97, 83, 83, 78}; //VALORES
        for (double valor : valoresConocidos) {
            double prediccion = A + (B * valor) + (C * Math.pow(valor, 2)); //Y= B0 +B1x + B2 al 2
            System.out.printf("Prediccion para X = %.2f: Y = %.2f%n", valor, prediccion);
        }
    }
    
    
    
}


 