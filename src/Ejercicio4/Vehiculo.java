package Ejercicio4;

/*
Crea una clase Vehiculo que represente un vehiculo en un sistema de inventario

Resultado esperado por consola:

Vehículo 1: Marca: Marca desconocida, Modelo: Modelo desconocido, Precio: 0.0
Vehículo 2: Marca: Toyota, Modelo: Corolla, Precio: 0.0
Vehículo 3: Marca: Honda, Modelo: Civic, Precio: 20000.0
 */

public class Vehiculo {

    public String marca;
    public String modelo;
    public double precio;

    public Vehiculo(){
        this.marca = "";
        this.modelo = "";
        this.precio = 0;
    }

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = 0;
    }

    public Vehiculo(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMarca(){
        return marca;
    }

    public double getPrecio(){
        return precio;
    }




}
