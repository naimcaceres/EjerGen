package Ejercicio1;

/*
Completar la funcion 'tribonacci', donde cada termino es la suma de los tres terminos anteriores.
Los primeros terminos de la serie Tribonacci son: 0,0,1,1,2,4,7,13,24,44.

T(n) = T(n-1) + T(n-2) + T(n-3)

Se debe devolver un array con los términos de la serie solicitada. En el caso de n = 10 se debe devolver 0, 0, 1, 1, 2, 4, 7, 13, 24, 44.
En caso de que n sea menor o igual a cero se debe devolver el array vacío.

Firma de la función:

public int[] tribonacci(int n)

// Resultado esperado por consola: Tribonacci series for n = 10: 0 0 1 1 2 4 7 13 24 44
 */

public class TribonacciEjer {
    public static void main(String[] args) {
        int n = 10;
        int[] result = tribonacci(10);

        System.out.print("Tribonacci series for n = " + n + ": ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int [] tribonacci(int n){

        int [] tribo = new int [n];

        if(n >= 0){
            tribo[0] = 0;
        }
        if(n >= 1){
            tribo[0] = 0;
            tribo[1] = 0;
        }

        if(n >= 2){
            tribo[0] = 0;
            tribo[1] = 0;
            tribo[2] = 1;
        }

        for(int i = 3; i < n; i++){
            tribo[i] = tribo[i-3] + tribo[i-2] + tribo[i-1];
        }
        return tribo;
    }

}
