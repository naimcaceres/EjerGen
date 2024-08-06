package Ejercicio6;
/*
Completar la funcion llamada contarPalabra en la que se debe contar cuantas veces aparece una palabra en una frase pasada por parametro

Resultado esperado en consola: La palabra 'hola' aparece 1 veces.
 */
public class ContarPalabraEjer {
    public static void main(String[] args) {
        String frase = "asas hola mundo, hola a todos dsds hola";
        String palabra = "hola";
        int resultado = contarPalabra(frase, palabra);
        System.out.println("La palabra '" + palabra + "' aparece " + resultado + " veces.");
    }
    public static int contarPalabra(String frase, String palabra){
        String palabraLow = palabra.toLowerCase();
        String fraseLow = frase.toLowerCase();
        int contador = 0;
        int index = fraseLow.indexOf(palabraLow);

        while(index >= 0){
            contador++;
            index = fraseLow.indexOf(palabraLow, index+1);
        }

        return contador;
    }
}
