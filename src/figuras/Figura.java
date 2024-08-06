package figuras;

/*
En este CodeRunner partimos de una clase Abstracta, llamada Figura, dentro de las cosas que tiene
figura es un metodo abstracto llamado calcularArea, tenemos ademas 3 clases que heredan de Figura,
que son Circulo, Rectangulo y Triangulo, cada una sobreescribe el metodo calcularArea() de acuerdo
a su forma de calcular el area.

Se debe implementar un metodo static dentro la clase Mostrar que recibe como parametro una lista de
Figura, con diferentes Clases, como Circulo, Rectangulo y Triangulo, referenciadas a Figura.

Se debe recorrer la lista indicando en cada elemento de la lista de que tipo de instancia es
(de las 3 posibles) y al final mostrar la suma de todas las areas de las figuras que estan en la lista.
 */

public abstract class Figura {

    String tipo;

    public Figura(String tipo){
        this.tipo = tipo;
    }

    public abstract double calcularArea();

}
