import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int mesNacimiento;
    private int diaNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String nombre, String apellido, int mes, int dia, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mesNacimiento = mes;
        this.diaNacimiento = dia;
        this.anioNacimiento = anio;
    }

    public void establecerNombre(String nombre) { this.nombre = nombre; }
    public String obtenerNombre() { return nombre; }
    public void establecerApellido(String apellido) { this.apellido = apellido; }
    public String obtenerApellido() { return apellido; }
    public void establecerMesNacimiento(int mes) { this.mesNacimiento = mes; }
    public int obtenerMesNacimiento() { return mesNacimiento; }
    public void establecerDiaNacimiento(int dia) { this.diaNacimiento = dia; }
    public int obtenerDiaNacimiento() { return diaNacimiento; }
    public void establecerAnioNacimiento(int anio) { this.anioNacimiento = anio; }
    public int obtenerAnioNacimiento() { return anioNacimiento; }

    public int obtenerEdad() {
        LocalDate nacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    public int obtenerFrecuenciaMaxima() { return 220 - obtenerEdad(); }

    public double obtenerFrecuenciaEsperadaMinima() { return obtenerFrecuenciaMaxima() * 0.50; }
    public double obtenerFrecuenciaEsperadaMaxima() { return obtenerFrecuenciaMaxima() * 0.85; }
}
