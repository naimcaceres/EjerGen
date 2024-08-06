package operacionesConMatrices;

/*
3 metodos:

- sumaElementosMatriz(): Metodo que recibe una matriz de dos dimensiones y calcula la suma todos los
elementos de la matriz, devolviendo un entero
- sumarMatrices(): Metodo que recibe dos matrices de dos dimensiones y suma ambas matrices devolviendo
la matriz resultante.
- imprimirMatriz(): Metodo que recibe una matriz de dos dimensiones e imprime la misma en un formato
de matriz, el metodo debe ser de tipo void.

Resultado en consola:

1   2   3
4   5   6
7   8   9
La suma de los elemntos de la matriz :
 */

public class OperacionesConMatrices {

    public static void main(String[] args) {
        OperacionesConMatrices operaciones = new OperacionesConMatrices();
        int [][] matrizEnteros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        operaciones.imprimirMatriz(matrizEnteros);
        System.out.println("La suma de los elementos de la matriz es: " + operaciones.sumaElementosMatriz(matrizEnteros));


        OperacionesConMatrices operaciones2 = new OperacionesConMatrices();
        int [][] matriz1 = {
                {1,2},
                {3,4}
        };

        int [][] matriz2 = {
                {5,6},
                {7,8}
        };

        System.out.println("Matriz 1:");
        operaciones.imprimirMatriz(matriz1);
        System.out.println("Matriz 2:");
        operaciones.imprimirMatriz(matriz2);
        int [][] resultado = operaciones.sumarMatrices(matriz1, matriz2);
        System.out.println("Resultado de la suma de matrices:");
        operaciones.imprimirMatriz(resultado);
    }

    public static int sumaElementosMatriz(int [][] matriz){
        int suma = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                suma+= matriz[i][j];
            }
        }

        return suma;


    }

    public static int [][] sumarMatrices(int [][] matriz, int [][] matriz2){

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int [][] matrices = new int [filas][columnas];

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                matrices[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }
        return matrices;
    }

    public void imprimirMatriz(int [][] matriz){

        for(int [] fila : matriz){
            for(int elem : fila){
                System.out.print(elem + " ");
            }
            System.out.println();
        }

    }
}
