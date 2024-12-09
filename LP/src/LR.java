
public class LR {
    
    public LR() {    
    }


    public double pendienteB1() {
        int n = MathOps.numeroDeDatos();
        double sumX = MathOps.sumaX();
        double sumY = MathOps.sumaY();
        double sumXY = MathOps.sumaXY();
        double sumX2 = MathOps.sumaDeLosCuadradosX();
        double result = ((n * sumXY) - (sumX * sumY)) / ((n * sumX2) - Math.pow(sumX, 2));
        
        return result;
    }

    public double interseccionB0() {
        double B1 = pendienteB1();
        double sumX = MathOps.sumaX();
        double sumY = MathOps.sumaY();
        double n = MathOps.numeroDeDatos();
        double resultb0 = ((sumY - (B1 * sumX)) / n);

        return resultb0;
    }

    public double prediccion(double n1) {
        double B1 = pendienteB1();
        double B0 = interseccionB0();
        double resultadoY = B0 + (B1 * n1);
        return resultadoY;
    }
}