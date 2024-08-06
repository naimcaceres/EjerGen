package Ejercicio3;

/*
Tenemos un procedimiento que recibe 3 parametros: un String, un array de tipo entero unidimensional y un numero entero.
Dentro del procedimiento se muestran unos mensjaes de acuerdo a los parametros recibidos, se debe controlar y colocar el codigo
si se puede producir una excepcion y controlarla.

Resultado esperado en consola:

Dato: Ejemplo
Elemento del vector en la posición 2: 3
Error: Índice fuera de los límites del array.
Error: El vector es nulo.

 */

import java.lang.reflect.Array;

public class PruebaExcepciones {

    public static void prueba(String dato, int vector[], int num) throws ArrayIndexOutOfBoundsException, NullPointerException{

        try{
            if(dato == null){
                throw new NullPointerException();
            }else{
                System.out.println("Dato: " + dato);
                try{
                    System.out.println("Elemento del vector en la posición " + num + ": " + vector[num]);
                }catch(NullPointerException e){
                    System.out.println("Error: El vector es nulo.");
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Error: Índice fuera de los límites del array.");
                }
            }
        }catch(NullPointerException ex){
            System.out.println("Error: el dato ingresado es nulo");
            try{
                System.out.println("Elemento del vector en la posición " + num + ": " + vector[num]);
            }catch(NullPointerException e){
                System.out.println("Error: El vector es nulo.");
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Error: Índice fuera de los límites del array.");
            }
        }

    }
    public static void main(String[] args) {
        String dato = "Ejemplo";
        int[] vector = {1, 2, 3, 4, 5};
        int num = 2;

        System.out.println("Prueba 1");
        prueba(dato, vector, num);
        System.out.println();
        System.out.println("Prueba 2");
        prueba(dato, vector, 10);
        System.out.println();
        System.out.println("Prueba 3");
        prueba(dato, null, 2);
        System.out.println();
        System.out.println("Prueba 4");
        prueba(null, null, 5);


    }

}
