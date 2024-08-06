package Ejercicio9;
/*
Escribe una funcion llamada 'determinante' que reciba una matriz 2x2 y calcule el determinante de la matriz dada

(( El determinante de una matriz cuadrada —matriz con el mismo número de filas que de columnas— se obtiene de restar
la multiplicación de los elementos de la diagonal principal de la matriz y la multiplicación de los elementos de la
diagonal secundaria de la misma matriz. ))

Resultado esperado en consola: El determinante de la matriz es: -2
 */
public class DeterminanteEjer {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2}, {3, 4}};
        int resultado = determinante(matriz);
        System.out.println("El determinante de la matriz es: " + resultado);  // Resultado esperado: -2
    }

    public static int determinante(int [][] matriz){

        /*int a = matriz[0][0];
        int b = matriz[0][1];
        int c = matriz[1][0];
        int d = matriz[1][1];

        return a*d - b*c;*/

        int deter = 0;
        int diagPrinc = 1;
        int diagSec = 1;

        for(int i = 0; i < matriz.length; i++){
                diagPrinc *= matriz[i][i];
                diagSec *= matriz[i][matriz.length - 1 - i];
        }
        deter = diagPrinc - diagSec;
        return deter;
    }

}
