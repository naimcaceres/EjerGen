package figuras;

public class Circulo extends Figura{

        public double radio;

        public Circulo(double radio){
            super("Circulo");
            this.radio = radio;
        }

        @Override
        public double calcularArea(){
            double area = Math.PI * radio * radio;
            return area;
        }
}
