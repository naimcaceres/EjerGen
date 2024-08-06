package empleados;

 /*
 Supongamos que estas desarollando un sistema de gestion de empleados para una empresa. Tienes tres tipos de empleados:
 Empleado, Gerente y Desarrollador

 1. Empleado: Esta clase representa a un empleado generico. Debe tener atributos como nombre, apellido, y salario, asi como metodos
 para obtener y establecer atributos.

 2. Gerente: Esta clase hereda de Empleado y añade un atributo extra, departamento, asi como metodos para obtener y establecer
 ese atrbiuto. Ademas, sobrescribe el metodo calcularSalario() para agregarle un bono del 10% sobre el salario base.

 3. Desarollador: Esta clase tambien hereda de Empleado, pero no tiene atributos adicionales. Sobrescribe el metodo
 calcularSalario(), para aregarle un bono del 20% sobre el salario base.
  */

public class Empleado {

    public String nombre;
    public String apellido;
    public double salario;

    public Empleado(){
        this.nombre = "";
        this.apellido = "";
        this.salario = 0;
    }

    public Empleado(String nombre, String apellido, double salario){
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellidp(){
        return apellido;
    }

    public double getSalario(){
        return salario;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }




}
