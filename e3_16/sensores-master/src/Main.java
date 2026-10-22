//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 public class Main {

    public static void main(String[] args) {

        Sensor sensor1 = new Sensor("Temperatura", "°C");
        Sensor sensor2 = new Sensor("Humedad", "%");
        Sensor sensor3 = new Sensor("Presion", "hPa");

        sensor1.actualizarLectura(25.5);
        sensor2.actualizarLectura(60);
        sensor3.actualizarLectura(1013.25);

        sensor1.mostrarInformacion();
        sensor2.mostrarInformacion();
        sensor3.mostrarInformacion();

        System.out.println(
                "Total de sensores: "
                        + Sensor.getCantidadSensores()
        );
    }
}