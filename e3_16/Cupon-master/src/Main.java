public class Main {

    public static void main(String[] args) {

        Cupon cupon1 = new Cupon();
        cupon1.codigo = "VERANO20";
        cupon1.porcentajeDescuento = 20;
        cupon1.descripcion = "Descuento de verano";
        cupon1.activo = true;

        Cupon cupon2 = new Cupon();
        cupon2.codigo = "OFERTA10";
        cupon2.porcentajeDescuento = 10;
        cupon2.descripcion = "Oferta especial";
        cupon2.activo = false;

        Cupon cupon3 = new Cupon();
        cupon3.codigo = "BIENVENIDO15";
        cupon3.porcentajeDescuento = 15;
        cupon3.descripcion = "Descuento para nuevos clientes";
        cupon3.activo = false;

        cupon1.mostrarInformacion();
        cupon2.mostrarInformacion();
        cupon3.mostrarInformacion();

        cupon1.mostrarResumen();
    }
}