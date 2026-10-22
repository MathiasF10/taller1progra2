public class Main {

    public static void main(String[] args) {

        Enlace enlace1 = new Enlace(
                "Quito", "Guayaquil", 1000
        );

        Enlace enlace2 = new Enlace(
                "Quito", "Cuenca", 500
        );

        Enlace enlace3 = new Enlace(
                "Guayaquil", "Manta", 300
        );

        Enlace enlace4 = new Enlace(
                "Cuenca", "Loja", 200
        );

        enlace1.activar();
        enlace2.activar();
        enlace3.activar();

        enlace1.mostrarInformacion();
        enlace2.mostrarInformacion();
        enlace3.mostrarInformacion();
        enlace4.mostrarInformacion();

        System.out.println(
                "Total de enlaces: " + Enlace.getTotalEnlaces()
        );

        System.out.println(
                "Enlaces activos: " + Enlace.getEnlacesActivos()
        );
    }
}