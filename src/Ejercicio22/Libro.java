package Ejercicio22;

/*
Escribe una clase Libro que tenga atributos título, autor y número de páginas.
Implementa métodos para obtener la información del libro y para verificar si el libro tiene más de 300 páginas.

Resultado esperado en consola:
--> Titulo: El Hobbir, Autor: J.R.R. Tolkien, Numero de paginas: 310
--> ¿El libro tiene mas de 300 paginas? true
--> Titulo: Cien años de soledad, Autor: Gabriel Garcia Marquez, Número de páginas: 200
--> ¿El libro tiene mas de 300 paginas? false

 */
public class Libro {

    public String titulo;
    public String autor;
    public int numPaginas;

    public Libro(){
        this.titulo = "";
        this.autor = "";
        this.numPaginas = 0;
    }

    public Libro(String titulo, String autor, int numPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getNumPaginas(){
        return numPaginas;
    }

    public String obtenerInformacion(){
        return "Titulo: " + this.getTitulo() + ", Autor: " + this.getAutor() + ", Número de páginas: " + this.getNumPaginas();
    }

    public boolean tieneMasDe300Paginas(){
        if(this.numPaginas > 300){
            return true;
        }else{
            return false;
        }
    }







    public static void main(String[] args) {
        Libro libro1 = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", 200);

        System.out.println(libro1.obtenerInformacion());  // Resultado esperado: "Título: El Hobbit, Autor: J.R.R. Tolkien, Número de páginas: 310"
        System.out.println("¿El libro tiene más de 300 páginas? " + libro1.tieneMasDe300Paginas());  // Resultado esperado: true

        System.out.println(libro2.obtenerInformacion());  // Resultado esperado: "Título: Cien años de soledad, Autor: Gabriel García Márquez, Número de páginas: 200"
        System.out.println("¿El libro tiene más de 300 páginas? " + libro2.tieneMasDe300Paginas());  // Resultado esperado: false
    }

}
