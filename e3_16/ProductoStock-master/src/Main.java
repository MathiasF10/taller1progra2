public class Main {

    public static void main(String[] args) {

        Producto producto = new Producto();

        producto.setNombre("Laptop");
        producto.setPrecio(800);
        producto.setStock(10);
        producto.setCategoria("Tecnologia");

        System.out.println("Producto: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Stock inicial: " + producto.getStock());
        System.out.println("Categoria: " + producto.getCategoria());

        producto.aumentarStock(5);

        System.out.println("Stock actualizado: " + producto.getStock());

        producto.aumentarStock(-3);

        System.out.println("Stock despues de validar: "
                + producto.getStock());
    }
}