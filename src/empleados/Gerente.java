package empleados;

public class Gerente extends Empleado{

    public String departamento;

    public Gerente(String nombre, String apellido, double precio, String departamento){
        super(nombre, apellido, precio);
        this.departamento = departamento;
    }

    @Override
    public double calcularSalario(){
        return this.salario * 1.10;
    }


}
