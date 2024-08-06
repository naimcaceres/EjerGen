package pregunta10Queue;


/*
En este caso se debe completar un procedimiento llamado usarCola, que recibe como parámetro el nombre de
una Cola que guarda datos tipo String, un String y un número entero, que puede valer 1 o 2. Si el número es 1
se debe agregar un elemento a la cola, si el número es 2, se debe sacar un elemento de la cola,
si se pasa cualquier otro número no debe hacer nada.
 */

public class Cola {
    public static void main(String[] args) {

        java.util.Queue<String> cola = new java.util.LinkedList<>();
        usarCola(cola, "tarea 1", 1);
        usarCola(cola, "tarea 2", 1);
        usarCola(cola, "tarea 3", 1);
        usarCola(cola, "", 2);
        System.out.println(cola);

        java.util.Queue<String> cola2 = new java.util.LinkedList<>();
        usarCola(cola2, "imp1", 1);
        usarCola(cola2, "imp2", 1);
        usarCola(cola2, "",2);
        usarCola(cola2, "imp3", 1);
        usarCola(cola2, "", 2);
        System.out.println(cola2);
    }

    public static void usarCola(java.util.Queue<String> cola, String s, int i) {

        if(i == 1){
            cola.offer(s);
        }else if(i == 2){
            cola.poll();
        }


    }
}
