import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int mes;
    private int dia;
    private int anio;

    public FrecuenciasCardiacas(String nombre, String apellido, int mes, int dia, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    public void establecerNombre(String nombre) { this.nombre = nombre; }
    public String obtenerNombre() { return nombre; }
    public void establecerApellido(String apellido) { this.apellido = apellido; }
    public String obtenerApellido() { return apellido; }
    public void establecerMes(int mes) { this.mes = mes; }
    public int obtenerMes() { return mes; }
    public void establecerDia(int dia) { this.dia = dia; }
    public int obtenerDia() { return dia; }
    public void establecerAnio(int anio) { this.anio = anio; }
    public int obtenerAnio() { return anio; }
    public int calcularEdad() {
        return Period.between(LocalDate.of(anio, mes, dia), LocalDate.now()).getYears();
    }
    public int frecuenciaMaxima() { return 220 - calcularEdad(); }
    public double frecuenciaMinimaEsperada() { return frecuenciaMaxima() * 0.50; }
    public double frecuenciaMaximaEsperada() { return frecuenciaMaxima() * 0.85; }
}
