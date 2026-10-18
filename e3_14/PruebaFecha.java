import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Mes: ");
        int mes = entrada.nextInt();
        System.out.print("Día: ");
        int dia = entrada.nextInt();
        System.out.print("Año: ");
        int anio = entrada.nextInt();

        Fecha fecha = new Fecha(mes, dia, anio);
        System.out.print("Fecha ingresada: ");
        fecha.mostrarFecha();

        fecha.establecerMes(12);
        fecha.establecerDia(25);
        fecha.establecerAnio(2026);
        System.out.print("Fecha modificada con los métodos establecer: ");
        fecha.mostrarFecha();
        System.out.printf("Obtenidos -> mes: %d, día: %d, año: %d%n",
            fecha.obtenerMes(), fecha.obtenerDia(), fecha.obtenerAnio());
    }
}
