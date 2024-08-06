package pregunta16MaxMatriz;
/*
En este caso se debe completar una función lllamada maxMatriz, que recibe como parámetro una matriz de 2 dimensiones de enteros,
en donde esta devuelve el valor del elemento mayor en la misma.

La firma de la función es la siguiente:

public int maxMatriz(int[][] matriz)
*/

public class MaxMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
            };
        System.out.println(maxMatriz(matriz));

        int [][] matriz2 = {
                {15,88,-34, 10},
                {11, 10, 99, 105},
                {30, 2, 10, 5},
        };
        System.out.println(maxMatriz(matriz2));
    }

    public static int maxMatriz(int[][] matriz) {
        int max = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] > max){
                    max = matriz[i][j];
                }
            }
        }
        return max;

    }


}

