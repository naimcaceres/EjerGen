package Ejercicio8;
/*
Escribe una funcion llamada buzzFizz que reciba como parametro un numero enteron positivo n. La funcion debe imrpimir por consola
los numeros del 1 al n.

Resultado esperado en consola:
1
2
3
buzz
5
fizz
7
buzz
9
10
11
buzzfizz
13
14
15
buzz
17
fizz
19
buzz
21
22
23
buzzfizz

 */
public class BuzzFizz {
    public static void main(String[] args) {
        int n = 24;
        buzzFizz(n);
    }

    public static void buzzFizz (int a){

        for(int i = 1; i <= a; i++){
            if(i % 4 == 0 && i % 6 == 0){
                System.out.println("buzzfizz");
            }else if(i % 4 == 0){
                System.out.println("buzz");
            }else if(i % 6 == 0){
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}
