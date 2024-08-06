package pregunta22OperacionesLinkedList;

import  java.util.*;

/*
Implementar Operaciones Básicas con LinkedList

Instrucciones:

    1. Crea una clase llamada OperacionesLinkedList con un método realizarOperaciones que realice las siguientes operaciones:
        - Agregar los números 1, 2, y 3 al final e la lista.
        - Mostrar la lista.
        - Eliminar el número 2 de la lista.
        - Mostrar la lista actualizada.
 */

public class OperacionesLinkedList {

    public static void main(String[] args) {
        OperacionesLinkedList operaciones = new OperacionesLinkedList();
        operaciones.agregarElemento(1);
        operaciones.agregarElemento(2);
        operaciones.agregarElemento(7);
        System.out.println("Lista inicial: " + operaciones.mostrarLista());
    }

    private LinkedList<Integer> lista;

    public OperacionesLinkedList() {
            lista = new LinkedList<>();

    }

    public void agregarElemento(int elemento) {
        lista.add(elemento);

    }

    public void eliminarElemento(int elemento) {
        lista.remove(elemento - 1);
    }

    public String mostrarLista(){
        return lista.toString();
    }


}
