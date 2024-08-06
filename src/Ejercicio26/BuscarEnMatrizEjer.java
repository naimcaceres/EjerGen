package Ejercicio26;

/*
Escribe una funcion llamada 'buscarEnMatriz' que reciba una matriz bidimensional de enteros y un entero.
La funcion debe retornar las coordenadas filas y columna de la primera aparicion del entero en la matriz.
Si el entero no esta en la matriz devolver 'null'

Salida esperada:
Valor encontrado en: Fila 1, Columna 1
 */
public class BuscarEnMatrizEjer {

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] coordenadas = buscarEnMatriz(matriz, 5);
        if (coordenadas != null) {
            System.out.println("Valor encontrado en: Fila " + coordenadas[0] + ", Columna " + coordenadas[1]);
        } else {
            System.out.println("Valor no encontrado.");
        }
    }

    public static int [] buscarEnMatriz(int[][]matriz, int valor){

        int [] array = new int [2];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(valor == matriz[i][j]){
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return null;
    }


}
