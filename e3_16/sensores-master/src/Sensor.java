public class Sensor {

    private int id;
    private String tipo;
    private String unidad;
    private double lectura;

    private static int cantidadSensores = 0;

    public Sensor(String tipo, String unidad) {
        cantidadSensores++;
        this.id = cantidadSensores;
        this.tipo = tipo;
        this.unidad = unidad;
        this.lectura = 0;
    }

    public void actualizarLectura(double lectura) {
        this.lectura = lectura;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Tipo: " + tipo);
        System.out.println("Unidad: " + unidad);
        System.out.println("Lectura: " + lectura);
        System.out.println("--------------------");
    }

    public static int getCantidadSensores() {
        return cantidadSensores;
    }
}