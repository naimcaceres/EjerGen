package Ejercicio20;

/*
Escribe una funcion llamada 'palindromo' que reciba un 'String' y determine si es un palindromo (se lee igual hacia adelante que hacia atras).

Resultado esperado en consola:
--> Anita lava la tina es palindromo: true;
--> Hola Mundo es palindromo: false
 */
public class Palindromo {
    public static void main(String[] args) {
        String texto1 = "Anita lava la tina";
        String texto2 = "Hola Mundo";

        System.out.println(texto1 + " es palíndromo: " + palindromo(texto1));  // Resultado esperado: true
        System.out.println(texto2 + " es palíndromo: " + palindromo(texto2));  // Resultado esperado: false

    }

    public static boolean palindromo(String texto) {
        String textoLimpio = texto.replaceAll("\\s", "").toLowerCase();
        String textoRev = new StringBuilder(textoLimpio).reverse().toString();

        return textoLimpio.equals(textoRev);
    }

}
