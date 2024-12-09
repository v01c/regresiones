public class MathOps {
    
//Σ x
public static  double sumaX() {
    double sumx = 0;
    for (double value : DataS.x) {
        sumx += value;
    }
    return sumx;
}
//Σ y
public static double sumaY() {
    double sumy = 0;
    DataS.ops.clear();
    for (double value : DataS.y) {
        sumy += value;
    }
    return sumy;
}

//Σ xy
public static double sumaXY() {
double sumxy = 0;
DataS.ops.clear();
for (int i = 0; i < DataS.x.size(); i++) {
    DataS.ops.add(DataS.x.get(i) * DataS.y.get(i)); 
    sumxy += DataS.ops.get(i);
}
return sumxy;
}

// Σ (x^2)y
public static double sumaX2Y() {
    double sumx2y = 0;
    DataS.ops.clear();
    for (int i = 0; i < DataS.x.size(); i++) {
        DataS.ops2.add(Math.pow(DataS.x.get(i), 2));
        DataS.ops.add(DataS.ops2.get(i) * DataS.y.get(i)); 
        sumx2y += DataS.ops.get(i);
    }
    return sumx2y; 
    }

    //Σ x^2
public static double sumaDeLosCuadradosX() {
    double sumx2 = 0;
    DataS.ops.clear();
    for (int i = 0; i < DataS.x.size(); i++) {
        DataS.ops.add(Math.pow(DataS.x.get(i), 2));
        sumx2 += DataS.ops.get(i);
    }
    return sumx2;
}

//Σ x^3
public static double sumaDeLosCubosX() {
    double sumx3 = 0;
    DataS.ops.clear();
    for (int i = 0; i < DataS.x.size(); i++) {
        DataS.ops.add(Math.pow(DataS.x.get(i), 3));
        sumx3 += DataS.ops.get(i);
    }
    return sumx3;
}

//Σ x^4
public static double sumaDeLaCuarta() {
    double sumx4 = 0;
    DataS.ops.clear();
    for (int i = 0; i < DataS.x.size(); i++) {
        DataS.ops.add(Math.pow(DataS.x.get(i), 4));
        sumx4 += DataS.ops.get(i);
    }
    return sumx4;
}


//n
public static int numeroDeDatos() {
    return DataS.x.size();
}
}

