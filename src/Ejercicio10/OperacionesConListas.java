package Ejercicio10;

import java.util.*;

/*
Escribe una clase en Java que modele una clase llamada 'OperacionesConListas'.

Resultado esperado:
15
5
3.0
 */
public class OperacionesConListas {
    public static void main(String[] args) {
        OperacionesConListas operaciones = new OperacionesConListas();
        List<Integer> lista = List.of(1, 2, 3, 4, 5);

        int suma = operaciones.sumaLista(lista);
        int maximo = operaciones.maximoLista(lista);
        double promedio = operaciones.promedioLista(lista);

        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + maximo);
        System.out.println("Promedio: " + promedio);
    }

    public static int sumaLista(List<Integer> lista){
        int suma = 0;
        for(Integer num : lista){
            suma+= num;
        }
        return suma;
    }

    public static int maximoLista(List <Integer> lista){
        return Collections.max(lista);
    }

    public double promedioLista(List <Integer> lista){
        double promedio = 0;
        double suma = 0;
        for(Integer num : lista){
            suma += num;
        }
        promedio = suma / lista.size();
        return promedio;
    }

}
