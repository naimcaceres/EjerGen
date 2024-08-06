package pregunta6Figura;
/*
En la clase Rectangulo, necesitarás implementar los métodos para calcular el área y el perímetro de un rectángulo utilizando su base y su altura
(que deberás definirlos como atributos del Rectangulo).

Operaciones para la implementación de los métodos.
área: base x altura;
perímetro: 2 x (base + altura)

Consejo: Observa bien el caso de prueba, allí teienes información sobre el nombre de la clase, tipo de dato y cantidad de parámetros para el
constructor, nombre de los métodos y tipo de dato de retorno.
 */
public class Rectangulo extends Figura{

    double base;
    double altura;

    public Rectangulo(){
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double area(){
        return base*altura;
    }

    public double perimetro(){
        return (base+altura) * 2;
    }


}
