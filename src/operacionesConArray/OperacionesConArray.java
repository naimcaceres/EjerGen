package operacionesConArray;

/*
Escribe una clase en Java que modele una clase llamada OperacionesConArray, que en ella tengamos tres métodos:

- multiplicacionArray(): Metodo que recibe un arreglo de double y calcula la multiplicacion de los elementos de un array de numeros decimales.
- maximoArray(): Metodo que recibe un arreglo de double y encuentra el elememento maximo en un array de numeros decimales.
- promedioArray(): Metodo que recibe un arreglo de double y calcula el promedio de los elementos de un array de numeros decimales.
 */

public class OperacionesConArray {

    public static double multiplicacionArray(double[] array) {
        double multiTotal = 1;
        for (double num : array) {
            multiTotal *= num;
        }
        return multiTotal;
    }

    public static double maximoArray(double [] array){
        double maximo = array[0];

        for(double num : array){
            if(num > maximo){
                maximo = num;
            }
        }
        return maximo;


    }

    public static double promedioArray(double [] array){
        double total = 0;
        for(double num : array){
            total+= num;
        }
        return total / array.length;


    }

}
