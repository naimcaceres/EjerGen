package pregunta13Traza;

/*
Escribe una función llamada traza, que reciba una matriz y un parámetro booleano (true representa la traza izquierda a derecha
y false la de derecha a izquierda), calcule la traza de la matriz dada en el sentido dado y devuelva el valor como un entero.

--> La traza de una matriz cuadrada es la suma de todos los elementos de la diagonal.

La matriz que se recibe de por hecho siempre es cuadrada.
 */

public class TrazaMatriz {

    public static void main(String[] args) {
        int [][] matriz = {
                {33, 2, 7},
                {4, 5, 6},
                {25, 8, 10}
        };
        int res1 = traza(matriz, true);
        System.out.println(res1);

        int res2 = traza(matriz, false);
        System.out.println(res2);
    }

    public static int traza(int [][] matriz, boolean izqADer){

        int res = 0;

        for(int i = 0; i < matriz.length; i++){
            if(izqADer){
                res += matriz[i][i];
            }else{
                res += matriz[i][matriz.length-1-i];
            }
        }
        return res;
    }
}
