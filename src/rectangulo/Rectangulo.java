package rectangulo;

/*
Escribe un programa en Java que modele una clase llamada Rectangulo que represente un rectangulo en un plano cartesiano.
Esta clase debe tener los siguientes atributos

- base (double) : Representa la longitud de la base del rectangulo.
- altura (double) : Representa la altura del rectangulo.

Crea el consturctor para que se puedan inicializar los atributos

La clase Rectangulo debe tener los siguientes metodos.

1. calcularArea() : Este metodo calcula el area del rectangulo (base x altura).
2. calcularPerimetro() : Este metodo calcula el perimetro del rectangulo (2 x (base + altura).

 */


public class Rectangulo {

    public double ancho;
    public double largo;

    public Rectangulo(){
        this.ancho = 0;
        this.largo = 0;
    }

    public Rectangulo(double ancho, double largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho(){
        return ancho;
    }

    public double getLargo(){
        return largo;
    }

    public double calcularArea(){
        return ancho*largo;
    }

    public double calcularPerimetro(){
        return (largo+ancho) * 2;
    }


    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());

        Rectangulo rectangulo2 = new Rectangulo(50, 10);
        System.out.println("Area: " + rectangulo2.calcularArea());
        System.out.println("Perimetro: " + rectangulo2.calcularPerimetro());
    }



}
