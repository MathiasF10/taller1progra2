import javax.swing.JOptionPane;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Primer nombre:");
        String apellido = JOptionPane.showInputDialog("Apellido:");
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de nacimiento (1-12):"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Día de nacimiento:"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento:"));

        FrecuenciasCardiacas fc = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);

        JOptionPane.showMessageDialog(null, String.format(
            "Nombre: %s%nApellido: %s%nFecha de nacimiento: %d/%d/%d%n%n"
            + "Edad: %d años%nFrecuencia cardiaca máxima: %d ppm%n"
            + "Frecuencia esperada: %.1f a %.1f ppm%n%n"
            + "Nota: son estimaciones de la AHA. Consulte a un profesional de la salud.",
            fc.obtenerNombre(), fc.obtenerApellido(),
            fc.obtenerDiaNacimiento(), fc.obtenerMesNacimiento(), fc.obtenerAnioNacimiento(),
            fc.obtenerEdad(), fc.obtenerFrecuenciaMaxima(),
            fc.obtenerFrecuenciaEsperadaMinima(), fc.obtenerFrecuenciaEsperadaMaxima()));
    }
}
