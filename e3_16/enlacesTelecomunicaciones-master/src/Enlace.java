public class Enlace {

    private int id;
    private String origen;
    private String destino;
    private double velocidadMbps;
    private boolean activo;

    private static int totalEnlaces = 0;
    private static int enlacesActivos = 0;

    public Enlace(
            String origen,
            String destino,
            double velocidadMbps
    ) {
        totalEnlaces++;
        this.id = totalEnlaces;
        this.origen = origen;
        this.destino = destino;
        this.velocidadMbps = velocidadMbps;
        this.activo = false;
    }

    public void activar() {
        if (!activo) {
            activo = true;
            enlacesActivos++;
        }
    }

    public void desactivar() {
        if (activo) {
            activo = false;
            enlacesActivos--;
        }
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Velocidad: " + velocidadMbps + " Mbps");
        System.out.println("Activo: " + activo);
        System.out.println("--------------------");
    }

    public static int getTotalEnlaces() {
        return totalEnlaces;
    }

    public static int getEnlacesActivos() {
        return enlacesActivos;
    }
}
