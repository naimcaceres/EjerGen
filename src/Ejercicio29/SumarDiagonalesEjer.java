package Ejercicio29;

/*
Escribe una funcion llamada 'sumarDiagonales' que reciba una matriz bidimensional de enteros y devuelva la suma de los elementos de la diagonal
principal y la diagonal secundaria.

Salida esperada:
La suma de las diagonales es: 37

 */
public class SumarDiagonalesEjer {
    public static int sumarDiagonales(int[][]matriz){

        int suma = 0;
        int n = matriz.length;

        for(int i = 0; i < n; i++){
            suma += matriz[i][i] + matriz[i][n-1-i];
        }
        return suma;

    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 10},
                {4, 5, 6},
                {7, 8, 9}
        };
        int suma = sumarDiagonales(matriz);
        System.out.println("La suma de las diagonales es: " + suma);
    }
}
