package pregunta18FizzBuzz;

/*
Escribe una función llamada fizzBuzz que reciba como parámetro un número entero positivo "n". La función debe imprimir por
consola los números del 1 al "n" (ambos incluidos), con un salto de línea entre cada número. Sin embargo,
para los números múltiplos de 3 debe imprimir "fizz", para los múltipos de 5 debe imprimir "buzz", y para los múltiplos
de 3 y 5 al mismo tiempo debe imprimir "fizzbuzz".
 */

public class FizzBuzzEj {

    public static void main(String[] args) {
        fizzBuzz(15);

    }

    public static void fizzBuzz(int n){

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            }else if(i % 5 == 0){
                System.out.println("buzz");
            }else if(i % 3 == 0){
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }

    }
}
