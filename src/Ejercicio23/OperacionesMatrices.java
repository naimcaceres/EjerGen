package Ejercicio23;

/*
Suma de Matrices

Crea una función llamada sumarMatrices que reciba dos matrices bidimensionales de enteros y devuelva una nueva matriz que sea la suma
de las dos matrices. Ambas matrices deben tener el mismo tamaño.

Resultado esperado en consola:

Resultado de la suma de matrices:

 */
public class OperacionesMatrices {
    public static int [][] sumarMatrices(int[][]matriz1, int[][]matriz2){

        int [][] suma =  new int[matriz1.length][matriz1[0].length];
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1[0].length; j++){
                suma[i][j] += matriz1[i][j] + matriz2[i][j];
            }
        }
        return suma;

    }

    public static void imprimirMatriz(int[][]matriz){

        for(int [] fila : matriz){
            for(int elem : fila){
                System.out.print(elem + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        int[][] matriz1 = {
                {2, 22, 3},
                {12, 5, 17},
                {14, 33, 6}
        };

        int[][] matriz2 = {
                {12, 8, 7},
                {6, 33, 4},
                {3, 11, 67}
        };

        int[][] resultado = sumarMatrices(matriz1, matriz2);
        System.out.println("Resultado de la suma de matrices:");
        imprimirMatriz(resultado);
    }
}
