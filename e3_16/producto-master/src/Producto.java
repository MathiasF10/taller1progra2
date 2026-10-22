public class Producto {

    public String nombre;
    public double precio;

    String categoria;
    boolean disponible;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Categoria: " + categoria);
        System.out.println("Disponible: " + disponible);
        System.out.println("-------------------");
    }

    public void activar() {
        disponible = true;
    }

    void desactivar() {
        disponible = false;
    }

    void mostrarPrecio() {
        System.out.println("Precio: " + precio);
    }
}