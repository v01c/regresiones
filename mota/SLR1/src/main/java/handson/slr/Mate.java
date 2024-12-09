
package handson.slr;

/**
 *
 * @author Benavides
 */


public class Mate {
    
    
    //METODO CALCULAR SUMATORIAS
        public static double sumX(double[] x) { //7
        double suma = 0;
        for (double value : x) {
            suma += value;
        }
        return suma;
    }

    //SUMATORIA Y
    public static double sumY(double[] y) {
        double suma = 0;
        for (double value : y) {
            suma += value;
        }
        return suma;
    }

    //  SUM X AL2
    public static double sumX2(double[] x) {
        double suma = 0;
        for (double value : x) {
            suma += Math.pow(value, 2);
        }
        return suma;
    }

    // X AL3
    public static double sumX3(double[] x) {
        double suma = 0;
        for (double value : x) {
            suma += Math.pow(value, 3);
        }
        return suma;
    }

    //  X AL 4
    public static double sumX4(double[] x) {
        double suma = 0;
        for (double value : x) {
            suma += Math.pow(value, 4);
        }
        return suma;
    }
    
    public static double sumX5(double[] x) {
        double suma = 0;
        for (double value : x) {
            suma += Math.pow(value, 5);
        }
        return suma;
    }
    
     public static double sumX6(double[] x) {
        double suma = 0;
        for (double value : x) {
            suma += Math.pow(value, 6);
        }
        return suma;
    }
    

    // SUM X *Y
    public static double sumXY(double[] x, double[] y) {
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += x[i] * y[i];
        }
        return suma;
    }

    //  SUM XAL2 * Y
    public static double sumX2Y(double[] x, double[] y) {
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += Math.pow(x[i], 2) * y[i];
        }
        return suma;
    }
    
    public static double sumX3Y(double[] x, double [] y){
        double suma =0;
        for (int i=0 ; i < x.length; i++){
            suma += Math.pow(x[i], 3) * y[i];
        }
        return suma;
    }
    
        
        //OBETENER NUMERO DE DATOS //3
        public static double numeroD(double[] advertising){
            return advertising.length;
        }
//PARA RESOLVER LA MATRIZ CON GAUUS
  public static double[] resolverSistema(double[][] matriz ) {
    int n = matriz.length;
    double[] resultados = new double[n];

    for (int i = 0; i < n; i++) {
        // Verificar pivote
        if (matriz[i][i] == 0) {
            throw new IllegalArgumentException("Pivote cero encontrado, matriz no resoluble.");
        }

        // Normalizar la fila actual
        double pivote = matriz[i][i];
        for (int j = i; j <= n; j++) {
            matriz[i][j] /= pivote;
        }
     

        // Eliminar hacia adelante
        for (int k = i + 1; k < n; k++) {
            double factor = matriz[k][i];
            for (int j = i; j <= n; j++) {
                matriz[k][j] -= factor * matriz[i][j];
            }
           
        }
    }

    // Sustitución hacia atrás
    for (int i = n - 1; i >= 0; i--) {
        resultados[i] = matriz[i][n];
        for (int j = i + 1; j < n; j++) {
            resultados[i] -= matriz[i][j] * resultados[j];
        }
    }

    return resultados;
}


}




    
    
