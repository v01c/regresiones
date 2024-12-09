public class QR{

    public QR(){
    }
double sumaX = MathOps.sumaX();
double sumaY = MathOps.sumaY();
double sumaX2 = MathOps.sumaDeLosCuadradosX();
double sumaX3 = MathOps.sumaDeLosCubosX();
double sumaX4 = MathOps.sumaDeLaCuarta();
double sumaXY = MathOps.sumaXY();
double sumaX2Y = MathOps.sumaX2Y();
double n = MathOps.numeroDeDatos();

//1.(Σx)x= [Σ x2] - [((Σ x)^2)/n]
    public double sumaXX(){
        double sumaX2 = MathOps.sumaDeLosCuadradosX();
        double sumaX = MathOps.sumaX();
        double n = MathOps.numeroDeDatos();

        double sumaXX = sumaX2 - (Math.pow(sumaX, 2)/n);

    return sumaXX;
    }


    //2. (Σx) y= [Σ  xy] - [(Σ  x * Σ  y)/n]       
    public double sumaXY(){
        double sumaX = MathOps.sumaX();
        double sumaY = MathOps.sumaY();
        double sumaXY = MathOps.sumaXY();      
        double n = MathOps.numeroDeDatos();

        double XY = sumaXY - ((sumaX * sumaY)/n);

    return XY;
    }


    //3.(Σx)x2 = [Σ  x3] - [(Σ  x2 * Σ x)/n]
    public double sumaX2X(){
        double sumaX = MathOps.sumaX();
        double sumaX2 = MathOps.sumaDeLosCuadradosX();
        double sumaX3 = MathOps.sumaDeLosCubosX();
        double n = MathOps.numeroDeDatos();

        double sumaX2X = sumaX3 - ((sumaX2 * sumaX)/n);

    return sumaX2X;
    }


    //4. (Σx2)y= [Σ  x2y] - [(Σ  x2 * Σ  y)/n]
    public double sumaX2Y(){
        double sumaX2 = MathOps.sumaDeLosCuadradosX();
        double sumaY = MathOps.sumaY();
        double sumaX2Y = MathOps.sumaX2Y();      
        double n = MathOps.numeroDeDatos();

        double X2Y= sumaX2Y - ((sumaX2 * sumaY)/n);

    return X2Y;
    }


    //5. (Σx2)x2= [Σ x4] - [((Σ x2)^2)/n]
    public double sumaX2X2(){
        
        double sumaX2 = MathOps.sumaDeLosCuadradosX();
        double sumaX4 = MathOps.sumaDeLaCuarta();
        
        double n = MathOps.numeroDeDatos();

        double sumaX2X2 = sumaX4 - ((Math.pow(sumaX2, 2))/n);

    return sumaX2X2;
    }

    public double A(){
        double XX = sumaXX();
        double XY = sumaXY();
        double X2X = sumaX2X();
        double X2Y = sumaX2Y();
        double X2X2 = sumaX2X2();


        double A = ((X2Y * XX)-(XY * X2X))/((XX * X2X2)- (Math.pow(X2X, 2)));

        return A;
    }

    public double B(){
        double XX = sumaXX();
        double XY = sumaXY();
        double X2X = sumaX2X();
        double X2Y = sumaX2Y();
        double X2X2 = sumaX2X2();

        double B = ((XY * X2X2)-(X2Y * X2X))/((XX * X2X2)- (Math.pow(X2X, 2)));
        return B;
    }

    public double C(){
        double A = A();
        double B = B();
        double sumaX = MathOps.sumaX();
        double sumaY = MathOps.sumaY();
        double sumaX2 = MathOps.sumaDeLosCuadradosX();
        double n = MathOps.numeroDeDatos();

        double C = ((sumaY/n) - (B * (sumaX/n)) -(A * (sumaX2/n)));

        return C;
    }

    public double prediccion(double n1){
        double A = A();
        double B = B();
        double C = C();

        double prediccion = (A * (Math.pow(n1, 2)) + (B * n1) + C);

        return prediccion;
    }




}