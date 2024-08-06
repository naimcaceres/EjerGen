package Ejercicio5;

/*
Completa la funcion llamada numerosConEspacios que recibe un arreglo de enteros y devuelve una cadena con
los numeros del arreglo separados por espacio.

Resultado esperado en consola:

Resultado: 1 2 3 4 5
 */

import java.util.Arrays;

public class NumerosConEspaciosEjer {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        String result = numerosConEspacios(array);
        System.out.println("Resultado: " + result);

    }

    public static String numerosConEspacios(int[] array){

        /*String numStr = "";
        for(int num : array){
            numStr += num + " ";
        }

        return numStr.trim();
         */

        StringBuilder numString = new StringBuilder();
        for(int num : array){
            numString.append(num).append(" ");
        }

        return numString.toString().trim();
    }
}
