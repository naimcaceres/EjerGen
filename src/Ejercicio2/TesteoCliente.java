package Ejercicio2;

public class TesteoCliente {
    public static void main(String[] args) {
        CrudClientesImp crud = new CrudClientesImp();

        Cliente c1 = new Cliente(1, "Juan Perez", "juan@example.com");
        Cliente c2 = new Cliente(2, "Maria Lopez", "maria@example.com");

        // Agregar clientes
        crud.agregar(c1);
        crud.agregar(c2);


        // Listar clientes
        System.out.println("Lista de clientes después de agregar:");
        crud.listar();
        System.out.println();

        // Modificar un cliente
        c1.setNombre("Juan Pérez Modificado");
        crud.modificar(c1);


        // Listar clientes
        System.out.println("Lista de clientes después de modificar:");
        crud.listar();
        System.out.println();

        // Eliminar un cliente
        crud.eliminar(c2);

        // Listar clientes
        System.out.println("Lista de clientes después de eliminar:");
        crud.listar();
        System.out.println();
    }
}
