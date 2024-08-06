package pregunta39BuscarPalabra;
import java.util.*;


/*
Completar la función, llamada buscarPalabra en la que se debe buscar en una frase pasada por parámetro, una palabra
que también es pasada por parámetro, mostrando el índice que se encuentra la palabra en la frase al principio de la frase
y al final de la frase. O sea, la primera vez que aparece y la ultima. El resultado de la búsqueda se devuelve el índice
en que aparecen en un array de 2 elementos, siendo la posición cero, el resultado de la busqueda de la palabra
al principio de la frase y la posición uno el resultado de la búsqueda al final de la frase. En caso de no estar la palabra
buscada en la frase se debe devolver -1 en ambos valores.

Firma de la función:
 - public int[] buscarPalabra (String frase, String palabra)
*/

public class BuscarPalabraEj {
    public static void main(String[] args) {
        String palabra = "abre";
        String frase = "Cuando abre y cierra cuando abre ASDAS ASas abre asas abre";
        int [] datos =  buscarPalabra(frase, palabra);
        System.out.println(java.util.Arrays.toString(datos));
    }

    public static int[] buscarPalabra(String frase, String palabra) {


        List<Integer> indices = new ArrayList<>();
        int indice = frase.indexOf(palabra);

        while(indice >= 0){
            indices.add(indice);
            indice = frase.indexOf(palabra, indice+1);
        }

        int [] indicesArray = new int [indices.size()];

        for(int i = 0; i < indices.size(); i++){
            indicesArray[i] = indices.get(i);
        }

        return indicesArray;

    }



}
