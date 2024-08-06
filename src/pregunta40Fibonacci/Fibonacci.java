package pregunta40Fibonacci;

/*
La serie de Fibonacci es una secuencia de números en la que cada número es la suma de los dos anteriores. La secuencia
comienza en 0 y 1, y luego cada número subsiguiente es la suma de los dos números anteriores. Por lo tanto, la secuencia
comienza asi: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 . Escribe una función llmada fibo que dado un entero n,
calcule la serie hasta el número n dado y la devuelva en un arrgelo el resultado.
 */

public class Fibonacci {
    public static void main(String[] args) {
        int n2 = 1;
        int [] fibonacciSeries2 = fibo(n2);
        System.out.println(java.util.Arrays.toString(fibonacciSeries2));

        int n3 = 7;
        int [] fibonacciSeries3 = fibo(n3);
        System.out.println(java.util.Arrays.toString(fibonacciSeries3));

        int n5 = 10;
        int [] fibonacciSeries5 = fibo(n5);
        System.out.println(java.util.Arrays.toString(fibonacciSeries5));
    }

    public static int[] fibo(int n) {

        int [] fibonacci = new int [n+1];

        if(n >= 0){
            fibonacci[0] = 0;
        }

        if(n >= 1){
            fibonacci[0] = 0;
            fibonacci[1] = 1;
        }

        if(n >= 2){
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            fibonacci[2] = 1;
        }

        for(int i = 3; i <= n; i++){
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }
        return fibonacci;
    }

}
