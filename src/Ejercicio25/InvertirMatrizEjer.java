package Ejercicio25;

/*
Escribe un método llamado invertirMatriz que reciba una matriz bidimensional de enteros y devuelva una nueva matriz que sea la inversa
de la original, es decir, la primera fila se convierte en la última, la segunda en la penúltima, etc.

Resultado esperado:

7 8 9
4 5 6
1 2 3
 */
public class InvertirMatrizEjer {
    public static int [][] invertirMatriz(int[][]matriz){

        int [][] matrizInv = new int [matriz.length][matriz[0].length];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matrizInv[i][j] = matriz[matriz.length - 1 - i][j];
            }
        }
        return matrizInv;

    }

    public static void imprimirMatriz(int[][]matriz){

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] invertida = invertirMatriz(matriz);
        imprimirMatriz(invertida);
    }
}
