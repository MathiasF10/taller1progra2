//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Estacion estacion1 =
                new Estacion("Laboratorio 1", "Temperatura");

        Estacion estacion2 =
                new Estacion("Laboratorio 2", "Humedad");

        Estacion estacion3 =
                new Estacion("Exterior", "Presion");

        estacion1.actualizarLectura(24.5);
        estacion2.actualizarLectura(55.0);
        estacion3.actualizarLectura(1012.8);

        estacion1.mostrarInformacion();
        estacion2.mostrarInformacion();
        estacion3.mostrarInformacion();

        System.out.println(
                "Total de estaciones: "
                        + Estacion.getTotalEstaciones()
        );
    }
}