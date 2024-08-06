package pregunta24CambioFin;

/*
Escribe una función llamada cambioFin, que reciba un arreglo de números enteros y devuelva otro arreglo
con los números del arreglo original pero comenzando desde el final.

Por ejemplo cambioFin([]1,2,3,4,5) devolverá [5,4,3,2,1].
 */


public class CambioFinEj {
    public static void main(String[] args) {
        int [] arreglo = {10,11,12,13,14,15};
        int [] actual = cambioFin(arreglo);
        System.out.println(java.util.Arrays.toString(actual));

        int [] arreglo2 = {5,4,3,2,1};
        int [] actual2 = cambioFin(arreglo2);
        System.out.println(java.util.Arrays.toString(actual2));
    }

    public static int [] cambioFin(int[] array){

        int n = array.length;
        int [] arrayInv = new int [n];

        for(int i = 0; i < n; i++){
            arrayInv[i] = array[n-1-i];
        }

        return arrayInv;

    }
}
