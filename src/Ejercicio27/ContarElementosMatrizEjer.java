package Ejercicio27;

/*
Escribe una funcion llamada 'contarElementosMatriz' que reciba una matriz bidimensional de enteros y un entero.
La funcion debe contar cuantas veces aparece el entero en la matriz.

Salida esperada:
El valor 2 aparece 3 veces.
 */
public class ContarElementosMatrizEjer {
    public static int contarElementosMatriz(int[][]matriz, int valor){

        int contador = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == valor){
                    contador++;
                }
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 2},
                {7, 2, 9}
        };
        int cantidad = contarElementosMatriz(matriz, 2);
        System.out.println("El valor 2 aparece " + cantidad + " veces.");
    }
}
