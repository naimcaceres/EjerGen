package Ejercicio16;

/*
Escribe una función llamada sumarDigitos que reciba un número entero y devuelva la suma de sus dígitos.

Resultado esperado en consola:
--> Suma de los dígitos: 10
 */
public class SumarDigitosEjer {

    public static void main(String[] args) {
        int numero = 1234;
        int resultado = sumarDigitos(numero);
        System.out.println("Suma de los dígitos: " + resultado);
    }

    public static int sumarDigitos(int numero){
            String numStr = String.valueOf(numero);
            char [] numCharArray = numStr.toCharArray();
            int suma = 0;

            for(char c : numCharArray){
                suma+= Character.getNumericValue(c);
            }

            return suma;
    }

}
