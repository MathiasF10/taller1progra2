public class Campania {

    public String nombre;
    public double presupuesto;

    String plataforma;
    boolean activa;

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Activa: " + activa);
        System.out.println("-------------------");
    }

    public void activar() {
        activa = true;
    }

    void desactivar() {
        activa = false;
    }

    void mostrarPresupuesto() {
        System.out.println("Presupuesto: " + presupuesto);
    }
}