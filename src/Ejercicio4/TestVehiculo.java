package Ejercicio4;

public class TestVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        Vehiculo v2 = new Vehiculo("Toyota", "Corolla");
        Vehiculo v3 = new Vehiculo("Honda", "Civic", 20000);

        System.out.println("Vehículo 1: Marca: " + v1.getMarca() + ", Modelo: " + v1.getModelo() + ", Precio: " + v1.getPrecio());
        System.out.println("Vehículo 2: Marca: " + v2.getMarca() + ", Modelo: " + v2.getModelo() + ", Precio: " + v2.getPrecio());
        System.out.println("Vehículo 3: Marca: " + v3.getMarca() + ", Modelo: " + v3.getModelo() + ", Precio: " + v3.getPrecio());
    }
}
