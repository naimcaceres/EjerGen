package productos;



public abstract class testProductos implements ICrudProductos{
    public static void main(String[] args) {
        ICrudProductos gestorProductos = new CrudProductosImp1();

        Producto p1 = new Producto(1, "Arroz", 55);
        Producto p2 = new Producto(2, "Marina", 60);
        Producto p3 = new Producto(3, "Cafe", 100);
        Producto p4 = new Producto(4, "Mayonesa", 130);
        gestorProductos.agregar(p1);
        gestorProductos.agregar(p2);
        gestorProductos.agregar(p3);
        gestorProductos.agregar(p4);

         //Modificar

        Producto p5 = new Producto(10, "Fideos", 70);
        gestorProductos.modificar(p5);
        p5 = new Producto(1, "Yerba", 180);
        gestorProductos.modificar(p5);
        p5 = new Producto(8, "Refresco", 90);
        gestorProductos.eliminar(p5);
        gestorProductos.agregar(p5);
        gestorProductos.eliminar(p4);
        gestorProductos.listar();
    }


}
