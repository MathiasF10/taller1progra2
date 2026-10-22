public class Cupon {

    public String codigo;
    public double porcentajeDescuento;

    String descripcion;
    boolean activo;

    public void mostrarInformacion() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Descuento: " + porcentajeDescuento + "%");
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Activo: " + activo);
        System.out.println("-------------------");
    }

    public void activar() {
        activo = true;
    }

    void desactivar() {
        activo = false;
    }

    void mostrarDescuento() {
        System.out.println(
                "Descuento: " + porcentajeDescuento + "%"
        );
    }

    void mostrarResumen() {
        System.out.println(
                "Cupon " + codigo
                        + " - Descuento " + porcentajeDescuento + "%"
        );
    }
}