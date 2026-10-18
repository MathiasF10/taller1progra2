import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Empleado[] empleados = new Empleado[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Empleado " + (i + 1));
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();
            System.out.print("Apellido: ");
            String apellido = entrada.nextLine();
            System.out.print("Salario mensual: ");
            double salario = entrada.nextDouble();
            entrada.nextLine();
            empleados[i] = new Empleado(nombre, apellido, salario);
        }

        System.out.println("\nSalario anual:");
        for (Empleado e : empleados)
            System.out.printf("%s %s: $%.2f%n", e.obtenerNombre(), e.obtenerApellido(), e.obtenerSalarioAnual());

        for (Empleado e : empleados)
            e.establecerSalarioMensual(e.obtenerSalarioMensual() * 1.10);

        System.out.println("\nSalario anual con aumento del 10%:");
        for (Empleado e : empleados)
            System.out.printf("%s %s: $%.2f%n", e.obtenerNombre(), e.obtenerApellido(), e.obtenerSalarioAnual());
    }
}
