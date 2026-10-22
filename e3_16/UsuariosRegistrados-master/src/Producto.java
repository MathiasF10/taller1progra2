public class Producto {

    private static int contadorProductos = 0;


    private int id;
    private String nombre;
    private double precio;
    private int stock;


    public Producto(String nombre, double precio, int stock) {

        contadorProductos++;

        this.id = contadorProductos;


        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }


    public static int getContadorProductos() {
        return contadorProductos;
    }


    public void mostrarInfo() {
        System.out.println("ID: " + this.id + "  Producto: " + this.nombre + "  Precio: $" + this.precio + " Stock: " + this.stock);
    }
}
