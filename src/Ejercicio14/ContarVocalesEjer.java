package Ejercicio14;

/*
Implementa la funcion llamada 'contarVocales' que reciba un 'String' y devuelva el numero de vocales que contiene

Resultado esperado en consola: --> Número de vocales: 4
 */
public class ContarVocalesEjer {


    public static void main(String[] args) {
        String texto = "Hola Mundo";
        int resultado = contarVocales(texto);
        System.out.println("Número de vocales: " + resultado);  // Resultado esperado: 4
    }

    public static int contarVocales(String texto){

        if(texto == null){
            return  0;
        }

        int contador = 0;
        for(int i = 0; i < texto.toLowerCase().length(); i++){
            char c = texto.charAt(i);

            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
                    break;
            }
        }
        return contador;

    }
}
