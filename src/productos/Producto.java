package productos;

/*
Dado las siguientes clases, tenemos una interfaz que tiene definido los metodos que hacen
un CRUD en un HashMap, la clase que implementa la interfaz se deben implementar los metodos
definidos en la interfaz para poder hacer un CRUD en un Mapa de Productos.
 */

public class Producto {

    public int id;
    public String nombre;
    public double precio;

    public Producto(){
        this.id = 0;
        this.nombre = "";
        this.precio = 0;
    }

    public Producto(int id, String nombre, double precio){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
