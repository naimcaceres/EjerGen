package Ejercicio2;

import java.util.*;

public class CrudClientesImp implements Crud{
    ArrayList <Cliente> clientes = new ArrayList<>();

    @Override
    public void agregar(Cliente c) {
        clientes.add(c);
    }
    @Override
    public void modificar(Cliente c) {
        for(Cliente cli : clientes){
            if(cli.getId() == c.getId()){
                cli.setNombre(c.getNombre());
                cli.setMail(c.getMail());
            }
        }
    }
    @Override
    public void eliminar(Cliente c) {
        clientes.remove(c);
    }
    @Override
    public void listar() {
        for(Cliente cli : clientes){
            System.out.println(cli);
        }
    }
}
