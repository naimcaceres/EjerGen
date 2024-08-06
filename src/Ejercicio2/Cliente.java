package Ejercicio2;

/*
Dado las siguientes clases, tenemos una interfaz que tiene definido los metodos que hacen CRUD en un 'ArrayList', la clase que implementa
la interfaz debe implementar los metodos definidos en la interfaz para poder hacer un CRUD en una lista de Clientes.

Resultado esperado en consola:

Lista de clientes después de agregar:
ID: 1, Nombre: Juan Perez, Email: juan@example.com
ID: 2, Nombre: Maria Lopez, Email: maria@example.com

Lista de clientes después de modificar:
ID: 1, Nombre: Juan Pérez Modificado, Email: juan@example.com
ID: 2, Nombre: Maria Lopez, Email: maria@example.com

Lista de clientes después de eliminar:
ID: 1, Nombre: Juan Pérez Modificado, Email: juan@example.com
 */

public class Cliente {

    int id;
    String nombre;
    String mail;

    public Cliente(){
        this.id = 0;
        this.nombre = "";
        this.mail = "";
    }

    public Cliente(int id, String nombre, String mail){
        this.id = id;
        this.nombre = nombre;
        this.mail = mail;
    }

    public int getId (){
        return id;
    }
    public String getNombre (){
        return nombre;
    }
    public String getMail (){
        return mail;
    }
    public void setId (int id){
        this.id = id;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setMail (String mail){
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
