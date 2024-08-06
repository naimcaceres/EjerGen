package pregunta3Asteriscos;

/*
Completa la función llamada ateriscos que recibe un arrgelo de enteros y me devuelva un histograma con asteriscos con los datos del arreglo
asteriscos([3,2,1]), me devuelve
3 ***
2 **
1 *
 */

public class AsteriscosFuncion {
    public static void main(String[] args) {
        int[] test6 = {1, 2, 3, 4, 5};
        asteriscos(test6);

        int[] test7 = {3, -1, 2};
        asteriscos(test7);
    }

    public static void asteriscos(int[] array) {

        /*for(int i = 0; i < array.length; i++){
            if(array[i] >= 0){
                System.out.print(array[i] + " ");
                for(int j = 0; j < array[i]; j++){
                    System.out.print("*");
                }

            }else{
                System.out.print(array[i]);
            }
            System.out.println();
        }*/

        for(int num : array){
            System.out.print(num + " ");
            for(int i = 0; i < num; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}