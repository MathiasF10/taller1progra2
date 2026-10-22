public class Main {

    public static void main(String[] args) {

        Producto producto1 = new Producto();
        producto1.nombre = "Laptop";
        producto1.precio = 800;
        producto1.categoria = "Tecnologia";
        producto1.disponible = true;

        Producto producto2 = new Producto();
        producto2.nombre = "Mouse";
        producto2.precio = 15;
        producto2.categoria = "Accesorios";
        producto2.disponible = true;

        Producto producto3 = new Producto();
        producto3.nombre = "Teclado";
        producto3.precio = 25;
        producto3.categoria = "Accesorios";
        producto3.disponible = true;

        producto1.desactivar();

        producto1.mostrarInformacion();
        producto2.mostrarInformacion();
        producto3.mostrarInformacion();
    }
}