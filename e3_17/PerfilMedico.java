import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double alturaCm;
    private double pesoKg;

    public PerfilMedico(String nombre, String apellido, String sexo,
                        int dia, int mes, int anio, double alturaCm, double pesoKg) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = dia;
        this.mesNacimiento = mes;
        this.anioNacimiento = anio;
        this.alturaCm = alturaCm;
        this.pesoKg = pesoKg;
    }

    public void establecerNombre(String nombre) { this.nombre = nombre; }
    public String obtenerNombre() { return nombre; }
    public void establecerApellido(String apellido) { this.apellido = apellido; }
    public String obtenerApellido() { return apellido; }
    public void establecerSexo(String sexo) { this.sexo = sexo; }
    public String obtenerSexo() { return sexo; }
    public void establecerDiaNacimiento(int dia) { this.diaNacimiento = dia; }
    public int obtenerDiaNacimiento() { return diaNacimiento; }
    public void establecerMesNacimiento(int mes) { this.mesNacimiento = mes; }
    public int obtenerMesNacimiento() { return mesNacimiento; }
    public void establecerAnioNacimiento(int anio) { this.anioNacimiento = anio; }
    public int obtenerAnioNacimiento() { return anioNacimiento; }
    public void establecerAlturaCm(double alturaCm) { this.alturaCm = alturaCm; }
    public double obtenerAlturaCm() { return alturaCm; }
    public void establecerPesoKg(double pesoKg) { this.pesoKg = pesoKg; }
    public double obtenerPesoKg() { return pesoKg; }

    public int obtenerEdad() {
        LocalDate nacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    public int obtenerFrecuenciaMaxima() { return 220 - obtenerEdad(); }
    public double obtenerFrecuenciaEsperadaMinima() { return obtenerFrecuenciaMaxima() * 0.50; }
    public double obtenerFrecuenciaEsperadaMaxima() { return obtenerFrecuenciaMaxima() * 0.85; }

    // BMI = peso (kg) / altura (m)^2
    public double calcularBMI() {
        double alturaM = alturaCm / 100.0;
        return pesoKg / (alturaM * alturaM);
    }

    public String clasificarBMI() {
        double bmi = calcularBMI();
        if (bmi < 18.5) return "Bajo peso";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Sobrepeso";
        return "Obeso";
    }
}
