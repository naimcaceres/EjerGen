package pregunta17Validar;

/*
Completar la función validar, que recibe como parámetro un String, y esta función debe validar
que el String contenga solo dígitos, números (0 al 9).
La función debe controlar además que el largo del String pasado debe ser mayor que 0 (cero) y no mayor de 9
caracteres, o sea es válido si cumple ambas condiciones.

La firma de la función es la siguiente:

public boolean validar (String dato)
 */

public class ValidarEj {

    public static void main(String[] args) {
        String dato = "123456";
        System.out.println(validar(dato));

        String dato2 = "123dd21";
        System.out.println(validar(dato2));


    }

    public static boolean validar(String palabra) {

        if (palabra.length() < 0 || palabra.length() > 9) {
            return false;
        }

        /*for(int i = 0; i < palabra.length(); i++){
            char c = palabra.toLowerCase().charAt(i);

            switch(c){

                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                default:
                    return false;
            }
        }
        return true;*/

        for (int i = 0; i < palabra.length(); i++) {
            if (!Character.isDigit(palabra.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
