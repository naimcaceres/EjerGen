package Ejercicio17;

/*
Escribe una clase Punto que represente un punto en el plano cartesiano.
Implementa métodos para calcular la distancia a otro punto y para determinar si dos puntos son iguales.

Resultado esperado en consola:
--> Distancia entre p1 y p2: 5.0
--> p1 es igual a p2: false
--> p1 es igual a p3: true
 */
public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Punto punto){

        return 0;
    }

    public boolean equals(Object obj){

        return false;
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(6, 8);
        Punto p3 = new Punto(3, 4);

        System.out.println("Distancia entre p1 y p2: " + p1.distancia(p2));
        System.out.println("p1 es igual a p2: " + p1.equals(p2));
        System.out.println("p1 es igual a p3: " + p1.equals(p3));
    }
}
