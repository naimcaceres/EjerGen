package Ejercicio28;

/*
Escribe un metodo llamado 'intercambiarFilas' que reciba una matriz bidimensional de enteros y dos indices de fila.
La funcion debe intercambiar las filas en los indices proporcionados y devolver la matriz modificada

Salida esperada:
7 8 9
4 5 6
1 2 3
 */
public class IntercambiarFilasEjer {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrizModificada = intercambiarFilas(matriz, 0, 2);
        imprimirMatriz(matrizModificada);
    }

    public static int [][] intercambiarFilas (int[][]matriz, int fila1, int fila2){

        int []temp = matriz[fila1] ;
        matriz[fila1] = matriz[fila2];
        matriz[fila2] = temp;

        return matriz;


    }

        public static void imprimirMatriz(int[][] matriz) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
        }



}


