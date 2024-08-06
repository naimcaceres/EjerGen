package Ejercicio18;

/*
Implementa una funcion llamada 'factorial' que calcule el factorial de un numero entero no negativo

Resultado esperado en consola:
--> Factorial de 5: 120
 */
public class FactorialEjer {


    public static void main(String[] args) {
        int numero = 5;
        long resultado = factorial(numero);
        System.out.println("Factorial de " + numero + ": " + resultado);
    }

    public static long factorial(int numero) {

        long num = 1;

        for(int i = 1; i <= numero; i++){
            num *= i;
        }

        return num;

    }

}
