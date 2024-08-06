package Ejercicio7;
/*
Escribe una funcion llamada reverso que reciba un String y devuelva el String invertido.

Resultado esperado en consola: Reverso de 'Hola': aloH
 */
public class Reverso {
    public static void main(String[] args) {
        String palabra = "Hola";
        String palabra2 = "que ondaaa";
        String resultado = reverso(palabra);
        String resultado2 = reverso(palabra2);
        System.out.println("Reverso de '" + palabra + "': '" + resultado +"'");
        System.out.println();
        System.out.println("Reverso de '" + palabra2 + "': '" + resultado2 +"'");
    }

    public static String reverso(String palabra) {
        String palabraReves = String.valueOf(new StringBuilder(palabra).reverse());

        return palabraReves;

    }
}