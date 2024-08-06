package Ejercicio24;

/*
Multiplicación de Matrices

Crea una función llamada multiplicarMatrices que reciba dos matrices bidimensionales de enteros y devuelva una nueva matriz que sea
el resultado de multiplicar las dos matrices.

Condición: El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz
para que la multiplicación sea válida.

Resultado de la multiplicacion de matrices:
19 22
43 50
 */
public class OperacionesMatrices {

    public static void main(String[] args) {
        int[][] matriz1 = {
                {1, 2},
                {3, 4}
        };
        int[][] matriz2 = {
                {5, 6},
                {7, 8}
                /*
                     matrizMulti[i][j] += matriz1[i][k] * matriz2[k][j];

                     1 Iteracion

                    matrizMulti[0][0] = matriz1[0][0] * matriz2[0][0];      == 1 * 5 == 5
                                            +                                                = 19
                    matrizMulti[0][0] = matriz1[0][1] * matriz2[1][0];      == 2 *  7 == 14

                     2 Iteracion

                    matrizMulti[0][1] = matriz1[0][0] * matriz2[0][1];      == 1 * 6 == 6
                                            +                                                = 22
                    matrizMulti[0][1] = matriz1[0][1] * matriz2[1][1];      == 2 *  8 == 16

                     3 Iteracion

                    matrizMulti[1][0] = matriz1[1][0] * matriz2[0][0];      == 3 * 5 == 15
                                            +                                                = 43
                    matrizMulti[1][0] = matriz1[1][1] * matriz2[1][0];      == 4 *  7 == 28

                    4 Iteracion

                    matrizMulti[1][1] = matriz1[1][0] * matriz2[0][1];      == 3 * 6 == 18
                                            +                                                = 50
                    matrizMulti[1][1] = matriz1[1][1] * matriz2[1][1];      == 4 *  8 == 32
                 */
        };

        try {
            int[][] resultado = multiplicarMatrices(matriz1, matriz2);
            System.out.println("Resultado de la multiplicación de matrices:");
            imprimirMatriz(resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int [][] multiplicarMatrices(int[][]matriz1, int[][]matriz2){

        if(matriz1[0].length != matriz2.length){
            return null;
        }

        int [][] multi = new int [matriz1.length][matriz1[0].length];

        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz2[i].length;j++){
                for(int k = 0; k < matriz1[i].length; k++){
                    multi[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return multi;

    }

    public static void imprimirMatriz(int[][]matriz){

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }


}
