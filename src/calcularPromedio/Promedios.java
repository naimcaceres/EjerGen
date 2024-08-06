package calcularPromedio;
/*
Escribe una funcion llamada calcularPromedio que reciba como parametro un array de numeros enteros
y devuelva el promedio de dichos numeros.

- Metodo estatico, por lo tanto no olvidarse del static en la firma del metodo.
 */
public class Promedios {

    public static void main(String[] args) {

        int [] numeros = {1, 2, 3, 4, 5};
        System.out.println("El promedio de los numeros ingresados es: " + calcularPromedio(numeros));

        int [] numeros2 = {4, 3, 7, 8, 9};
        System.out.println("El promedio del seguno array de numeros es: " + calcularPromedio(numeros2));
    }

    public static double calcularPromedio(int [] array){
        double suma = 0;
        for(double num : array){
            suma += num;
        }
        return suma / array.length;
    }

}
