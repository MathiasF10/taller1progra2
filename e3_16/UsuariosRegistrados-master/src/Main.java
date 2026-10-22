//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Mouse", 25.50, 10);
        Producto producto2 = new Producto("Teclado", 45.00, 15);
        Producto producto3 = new Producto("Monitor", 180.00, 5);
        Producto producto4 = new Producto("Audífonos", 60.00, 8);
        Producto producto5 = new Producto("Alfombrilla", 12.50, 25);


        producto1.mostrarInfo();
        producto2.mostrarInfo();
        producto3.mostrarInfo();
        producto4.mostrarInfo();
        producto5.mostrarInfo();




        System.out.println("Total de productos: " + Producto.getContadorProductos());
    }
}