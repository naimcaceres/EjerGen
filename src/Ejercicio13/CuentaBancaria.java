package Ejercicio13;

/*
Escribe una clase 'CuentaBancaria' que represente una cuenta bancaria. Implemenya metodos para depositar,
retirar y consultarSaldo.

Resultado esperado en consola:
--> Error: Saldo insuficiente.
--> Saldo final: 1300.0
 */
public class CuentaBancaria {

    String numCuenta;
    String nombre;
    static double saldo;

    public CuentaBancaria(){
        this.numCuenta = "";
        this.nombre = "";
        this.saldo = 0;
    }

    public CuentaBancaria(String numCuenta, String nombre, double saldo){
        this.numCuenta = numCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public static void retirar(double cantidad){
        if(saldo >= cantidad){
            saldo -= cantidad;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public static void depositar(double cantidad){
        if(cantidad > 0){
            saldo += cantidad;
        }else{
            System.out.println("Debe ingresar un monto mayor a 0");
        }
    }

    public double consultarSaldo(){
        return saldo;
    }



   public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", "Juan Pérez", 1000);

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(1500);

        System.out.println("Saldo final: " + cuenta.consultarSaldo());
    }
}
