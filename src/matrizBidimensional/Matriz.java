package matrizBidimensional;

/*
Tenemos un metodo que recibe como parametro una matriz bidimensional n x n, de caracteres,
debemos completar la misma, para que al mostrarla, aparezcan en el contorno o perimetro de la misma el caracter '#'
llamado numeral. Los otros caracteres interiores se deben llenar con el caracter vacio ' '.

# # # # # # #
#           #
#           #
#           #
#           #
# # # # # # #
 */

public class Matriz {

    public static void main(String[] args) {

        char [][] matriz = new char [6][6];
        matrizMostrar(matriz);

        char [][] matriz2 = new char [4][4];
        matrizMostrar(matriz2);

        char [][] matriz3 = new char [8][8];
        matrizMostrar(matriz3);
    }

    public static void matrizMostrar(char [][] matriz){

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = '#';
            }
        }

        for(int i = 1; i < matriz.length-1; i++){
            for(int j = 1; j < matriz[i].length-1; j++){
                matriz[i][j] = ' ';
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}


