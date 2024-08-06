package figuras;

import java.util.*;


public class Mostrar {

/*
Se debe recorrer toda la lista e ir mostrando por consola el tipo de clase
que se esta recorriendo (tienen 3 clases posibles).
El nombre de las clases a mostrar deben ser como estan definidas en las respectivas clases. (Circulo)
y ademas se debe sumar todas las areas de las diferentes figuras que estan en la lista
de nombre figuras, y luego mostrar el resultado en la consola

 */

    public static void mostrarDatos (List <Figura> figuras) {

        double areaTotal = 0;
        for(Figura fig : figuras){
            System.out.println(fig.tipo);
            areaTotal += fig.calcularArea();
        }
        System.out.println(areaTotal);
    }
}
