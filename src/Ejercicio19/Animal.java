package Ejercicio19;

/*
Escribe una clase Animal con los atributos nombre y edad. Crea subclases Perro y Gato que hereden de Animal.
Cada subclase debe tener un método hacerSonido que imprima un sonido característico.

Resultado esperado en consola:
--> Guau
--> Miau
 */
public class Animal {

    public String nombre;

    public int edad;

    public Animal(){
        this.nombre = "";
        this.edad = 0;
    }

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void hacerSonido(){

    }
}
