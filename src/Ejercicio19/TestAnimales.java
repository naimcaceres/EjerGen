package Ejercicio19;

public class TestAnimales {
    public static void main(String[] args) {
        Animal perro = new Perro("Rex", 5);
        Animal gato = new Gato("Whiskers", 3);

        perro.hacerSonido();  // Resultado esperado: "Guau"
        gato.hacerSonido();   // Resultado esperado: "Miau"
    }
}
