package Ejercicio15;

/*
Escribe una clase 'Persona' que tenga los siguientes atributos: nombre, edad, direccion.
Implementa un metodo 'esMayorDeEdad' que devuelva 'true' si la persona tiene 18 años o más.

Resultado esperado en consola:
--> Es mayor de edad: true
--> Es mayor de edad: false
 */
public class Persona {

    String nombre;
    int edad;
    String direccion;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.direccion = "";
    }

    public Persona(String nombre, int edad, String direccion){
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public boolean esMayorDeEdad(){
        if(edad > 18){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Ana", 20, "Calle Falsa 123");
        System.out.println("Es mayor de edad: " + persona.esMayorDeEdad());  // Resultado esperado: true

        Persona personaMenor = new Persona("Luis", 16, "Calle Real 456");
        System.out.println("Es mayor de edad: " + personaMenor.esMayorDeEdad());  // Resultado esperado: false
    }
}
