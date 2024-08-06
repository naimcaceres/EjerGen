package empleados;

public class Desarrollador extends Empleado{

    public Desarrollador(String nombre, String apellido, double salario){
        super(nombre, apellido, salario);
    }

    @Override
    public double calcularSalario(){
        return this.salario * 1.20;
    }

}
