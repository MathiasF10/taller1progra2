import javax.swing.JOptionPane;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Primer nombre:");
        String apellido = JOptionPane.showInputDialog("Apellido:");
        String sexo = JOptionPane.showInputDialog("Sexo:");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Día de nacimiento:"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes de nacimiento (1-12):"));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Año de nacimiento:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura (cm):"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso (kg):"));

        PerfilMedico p = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        String mensaje = String.format(
            "DATOS%nNombre: %s%nApellido: %s%nSexo: %s%nFecha de nacimiento: %d/%d/%d%n"
            + "Altura: %.1f cm%nPeso: %.1f kg%n%n"
            + "RESULTADOS%nEdad: %d años%nBMI: %.2f (%s)%n"
            + "Frecuencia cardiaca máxima: %d ppm%nFrecuencia esperada: %.1f a %.1f ppm%n%n"
            + "VALORES DE BMI%nBajo peso: menos de 18.5%nNormal: entre 18.5 y 24.9%n"
            + "Sobrepeso: entre 25 y 29.9%nObeso: 30 o más",
            p.obtenerNombre(), p.obtenerApellido(), p.obtenerSexo(),
            p.obtenerDiaNacimiento(), p.obtenerMesNacimiento(), p.obtenerAnioNacimiento(),
            p.obtenerAlturaCm(), p.obtenerPesoKg(),
            p.obtenerEdad(), p.calcularBMI(), p.clasificarBMI(),
            p.obtenerFrecuenciaMaxima(),
            p.obtenerFrecuenciaEsperadaMinima(), p.obtenerFrecuenciaEsperadaMaxima());

        JOptionPane.showMessageDialog(null, mensaje, "Perfil médico", JOptionPane.INFORMATION_MESSAGE);
    }
}
