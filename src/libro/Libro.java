package libro;

/*
Escribe una clase en Java que modele una clase llamada Libro, que represente a un libro,
esta clase debe tener los siguientes atributos.

- titulo (String) : Representa el titulo del Libro.
- autor (String) : Representa el autor del Libro.
- anioPublicacion(int) : Representa el año de publicacion del Libro.
- isbn (String): Representa el ISBN del libro (el identificador).
- estaDisponible (boolean) : Representa si el Libro esta disponible o no.

Crea el constructor para que se puedan inicializar los atributos

La clase Libro debe tener los siguientes metodos:

- mostrarInformacion() : Este metodo imprime cada uno de los atributos del libro separados por
un salto de linea.
- estaDisponible() : Este metodo imprime si el libro se encuentra disponible o no.

 */


public class Libro {

    public String titulo;
    public String autor;
    public int anioPublicacion;
    public String isbn;
    public boolean estaDisponible;

    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.anioPublicacion = 0;
        this.isbn = "";
        this.estaDisponible = false;
    }

    public Libro(String titulo, String autor, int anioPublicacion, String isbn, boolean estaDisponible){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.estaDisponible = estaDisponible;
    }

    public void mostrarInformacion(){
        System.out.println(titulo);
        System.out.println(autor);
        System.out.println(anioPublicacion);
        System.out.println(estaDisponible);
    }

    public boolean estaDisponible(){
        if(this.estaDisponible){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("El codigo da Vinci", "Dan Brown", 2003, "90980909809", true);
        libro1.mostrarInformacion();
        libro1.estaDisponible();

        Libro libro2 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 1967, "4545237823", false);
        libro2.mostrarInformacion();
        libro2.estaDisponible();
    }



}
