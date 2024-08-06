package figuras;

import java.util.*;

public class TestFiguras {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(5));
        figuras.add(new Rectangulo(5,10));
        figuras.add(new Circulo(7));
        figuras.add(new Triangulo(5,8));
        figuras.add(new Triangulo(12,6));
        figuras.add(new Circulo(6));
        Mostrar mostrar = new Mostrar();
        mostrar.mostrarDatos(figuras);
    }
}
