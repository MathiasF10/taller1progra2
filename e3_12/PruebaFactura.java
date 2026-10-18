import javax.swing.JOptionPane;

public class PruebaFactura {
    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Número de pieza:");
        String descripcion = JOptionPane.showInputDialog("Descripción de la pieza:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad a comprar:"));
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio por artículo:"));

        Factura factura = new Factura(numero, descripcion, cantidad, precio);

        JOptionPane.showMessageDialog(null, String.format(
            "FACTURA%nPieza: %s%nDescripción: %s%nCantidad: %d%nPrecio: $%.2f%nMonto total: $%.2f",
            factura.obtenerNumeroPieza(), factura.obtenerDescripcion(),
            factura.obtenerCantidad(), factura.obtenerPrecio(), factura.obtenerMontoFactura()));

        // Demostración de validaciones
        factura.establecerCantidad(-5);
        factura.establecerPrecio(-2.5);
        JOptionPane.showMessageDialog(null, String.format(
            "Tras establecer valores negativos:%nCantidad: %d%nPrecio: %.1f%nMonto: %.2f",
            factura.obtenerCantidad(), factura.obtenerPrecio(), factura.obtenerMontoFactura()));
    }
}
