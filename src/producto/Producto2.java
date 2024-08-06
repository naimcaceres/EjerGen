package producto;

/*
Escribe una clase Producto que represente un producto en un sistema de gestion de invenatrio.
La clase debe tener los siguientes atributos:

- id (int) : El identificador unico del producto.
- nombre (String) : El nombre del producto.
- precio (double) : El precio del producto.
- cantidad (int) : La cantidad disponible del producto en inventario.

Implementa los siguientes constructores para la clase Producto.

1. Un constructor vacio que inicialice todos los atributos a sus valores predeterminados.
2. Un constructor que acepte el id, nombre y precio del producto y lo inicialice con estos valores, dejando cantidad en 0.
3. Un constructor que acepte el id, nombre, precio y cantidad del producto y lo inicialice con estos valores.

 */


public class Producto2 {

    public int id;
    public String nombre;
    public double precio;
    public int cantidad;

    public Producto2(){
        this.id = 0;
        this.nombre = "";
        this.precio = 0;
        this.cantidad = 0;
    }

    public Producto2(int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
    }

    public Producto2(int id, String nombre, double precio, int cantidad){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public int getCantidad(){
        return cantidad;
    }


    public static void main(String[] args) {
        Producto2 producto = new Producto2();
        Producto2 producto2 = new Producto2(1, "Camiseta", 25.99);
        Producto2 producto3 = new Producto2(2, "Pantalon", 39.99, 50);

        System.out.println("Constructor vacio");
        System.out.println("ID: " + producto.getId());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());
        System.out.println();
        System.out.println("Constructor sin cantidad");
        System.out.println("ID: " + producto2.getNombre());
        System.out.println("Nombre: " + producto2.getNombre());
        System.out.println("Precio: " + producto2.getPrecio());
        System.out.println("Cantidad: " + producto2.getCantidad());
        System.out.println();
        System.out.println("Constructor completo");
        System.out.println("Id: " + producto3.getId());
        System.out.println("Nombre: " + producto3.getNombre());
        System.out.println("Precio: " + producto3.getPrecio());
        System.out.println("Cantidad: " + producto3.getCantidad());
    }




}






