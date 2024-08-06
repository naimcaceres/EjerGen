package operacionesConArray;

public class TestOperacionesConArray {
    public static void main(String[] args) {

        OperacionesConArray operaciones =  new OperacionesConArray();
        double [] arrayEnteros = {1, 2, 3, 4, 5};

        System.out.println("La multiplicacion de los elementos del array es: " + operaciones.multiplicacionArray(arrayEnteros));
        System.out.println("El maximo elemento del array es: " + operaciones.maximoArray(arrayEnteros));
        System.out.println("El promedio de los elementos del array es: " + operaciones.promedioArray(arrayEnteros));

    }
}
