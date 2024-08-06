package pregunta2Producto;

/*
Crea una clase Producto que represente un producto en un sistema de inventario. La clase debe tener los siguientes atributos: nombre, precio, cantidad.
Implementa varios constructores sobrecargados para la clase Producto de la siguiente manera.

1. Un constructor que tome el nombre y el precio del producto.
2. Un constructor que tome el nombre, el precio y la cantidad del producto.
3. Un constructor sin parámetros que inicialice el nombre como "Producto sin nombre" el precio como 0 y la cantidad como 0

Consejo: Observa bien el caso de prueba (TestProducto), alli tienes informacion sobre el nombre de la clase, tipos de datos de los atributos, nombres de los metodos get,
y tipo de dato de retorno.
 */


public class Producto {

    public String nombre;
    public double precio;
    public int cantidad;

    public Producto(){
            this.nombre = "Producto sin nombre";
            this.precio = 0.0;
            this.cantidad = 0;
    }

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = 0;
    }

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
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



}
