package Ejercicio21;

/*
Crea una funcion llamada 'esPrimo' que determine si un numero entero es primo (un numero primo es aquel que solo es divisible
por 1 y por si mismo).

Resultado esperado en consola:
--> 7 es primo: true
--> 10 es primo: false
 */
public class EsPrimoEjer {
    public static void main(String[] args) {
        int numero1 = 7;
        int numero2 = 10;

        System.out.println(numero1 + " es primo: " + esPrimo(numero1));  // Resultado esperado: true
        System.out.println(numero2 + " es primo: " + esPrimo(numero2));  // Resultado esperado: false
    }

    public static boolean esPrimo(int numero){

        if(numero % 2 == 1){
            return true;
        }else{
            return false;
        }
    }

}
