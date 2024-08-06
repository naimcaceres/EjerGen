package figuras;

public class Rectangulo extends Figura{

    public double largo;
    public double ancho;

    public Rectangulo(double largo, double ancho){
        super("Rectangulo");
        this.largo = largo;
        this.ancho = ancho;
    }

    public double calcularArea(){
        return largo*ancho;
    }



}
