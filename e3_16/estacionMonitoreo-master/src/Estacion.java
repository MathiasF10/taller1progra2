public class Estacion {

    private int id;
    private String ubicacion;
    private String variable;
    private double lectura;

    private static int totalEstaciones = 0;

    public Estacion(String ubicacion, String variable) {
        totalEstaciones++;
        this.id = totalEstaciones;
        this.ubicacion = ubicacion;
        this.variable = variable;
        this.lectura = 0;
    }

    public void actualizarLectura(double nuevaLectura) {
        this.lectura = nuevaLectura;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Variable: " + variable);
        System.out.println("Lectura: " + lectura);
        System.out.println("--------------------");
    }

    public static int getTotalEstaciones() {
        return totalEstaciones;
    }
}