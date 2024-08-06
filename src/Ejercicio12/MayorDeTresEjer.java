package Ejercicio12;

/*
Crea una funcion llamada 'mayorDeTres' que reciba tres numeros enteros como parametros y devuelva
el mayor de los tres.

Resultado esperado en consola: El mayor de los tres numeros es: 8
 */
public class MayorDeTresEjer {
    public static void main(String[] args) {
        int num1 = 5, num2 = 8, num3 = 3;
        int resultado = mayorDeTres(num1, num2, num3);
        System.out.println("El mayor de los tres números es: " + resultado);  // Resultado esperado: 8
    }

    public static int mayorDeTres(int num1, int num2, int num3){

        int [] tres = new int [3];
        tres[0] = num1;
        tres[1] = num2;
        tres[2] = num3;
        int max = 0;

        for(int num : tres){
            if(num > max){
                max = num;
            }
        }
        return max;
    }

}
