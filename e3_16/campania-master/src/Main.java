public class Main {

    public static void main(String[] args) {

        Campania campania1 = new Campania();
        campania1.nombre = "Promocion de productos";
        campania1.presupuesto = 100;
        campania1.plataforma = "Instagram";
        campania1.activa = false;

        Campania campania2 = new Campania();
        campania2.nombre = "Publicidad juvenil";
        campania2.presupuesto = 150;
        campania2.plataforma = "TikTok";
        campania2.activa = false;

        Campania campania3 = new Campania();
        campania3.nombre = "Ventas online";
        campania3.presupuesto = 200;
        campania3.plataforma = "Facebook";
        campania3.activa = false;

        campania1.activar();

        campania1.mostrarInformacion();
        campania2.mostrarInformacion();
        campania3.mostrarInformacion();
    }
}