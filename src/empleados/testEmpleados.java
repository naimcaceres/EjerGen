package empleados;

public class testEmpleados {
      public static void main(String[] args) {
        Empleado empleado = new Empleado ("Juan", "Perez", 30000);
        Gerente gerente = new Gerente("Maria", "Gonzalez", 60000, "Ventas");
        Desarrollador desarollador = new Desarrollador("Pedro", "Lopez", 40000);

        System.out.println("Salario de " + empleado.getNombre() + ": $" + empleado.calcularSalario());
        System.out.println("Salario de " + gerente.getNombre() + ": $" + gerente.calcularSalario());
        System.out.println("Salario de " + desarollador.getNombre() + ": $" + desarollador.calcularSalario());
    }
}
