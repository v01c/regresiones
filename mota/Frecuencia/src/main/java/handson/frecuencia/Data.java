
package handson.frecuencia;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Clase que contiene el dataset predefinido y métodos para obtener sus valores.
 */
public class Data {
    private ArrayList<Double> datos;

    // Constructor: Inicializa el dataset con 40 valores predefinidos.
    public Data() {
        datos = new ArrayList<>();
        // Añadir 40 valores reales.
        Collections.addAll(datos, 
            23.5, 25.0, 27.8, 22.1, 30.0, 28.4, 35.7, 40.2, 22.1, 23.5,
            25.0, 33.3, 30.0, 28.4, 40.2, 45.5, 48.1, 50.0, 52.3, 55.0,
            27.8, 25.0, 22.1, 35.7, 40.2, 30.0, 33.3, 45.5, 23.5, 27.8,
            48.1, 50.0, 52.3, 55.0, 60.5, 62.0, 65.0, 68.0, 70.2, 72.5
        );
        Collections.sort(datos); // Ordenar los datos.
    }

    // Obtiene todos los datos del dataset.
    public ArrayList<Double> getDatos() {
        return datos;
    }

    // Obtiene el valor mínimo.
    public double getMin() {
        return datos.get(0);
    }

    // Obtiene el valor máximo.
    public double getMax() {
        return datos.get(datos.size() - 1);
    }

    // Obtiene el número total de datos.
    public int getSize() {
        return datos.size();
    }
}