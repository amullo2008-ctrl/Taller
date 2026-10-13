import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String nombre;
    private String apellido;
    private String sexo;
    private int dia;
    private int mes;
    private int anio;
    private double altura;
    private double peso;

    public PerfilMedico(String nombre, String apellido, String sexo, int dia,
                        int mes, int anio, double altura, double peso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }
    public void establecerNombre(String nombre) { this.nombre = nombre; }
    public String obtenerNombre() { return nombre; }
    public void establecerApellido(String apellido) { this.apellido = apellido; }
    public String obtenerApellido() { return apellido; }
    public void establecerSexo(String sexo) { this.sexo = sexo; }
    public String obtenerSexo() { return sexo; }
    public void establecerDia(int dia) { this.dia = dia; }
    public int obtenerDia() { return dia; }
    public void establecerMes(int mes) { this.mes = mes; }
    public int obtenerMes() { return mes; }
    public void establecerAnio(int anio) { this.anio = anio; }
    public int obtenerAnio() { return anio; }
    public void establecerAltura(double altura) { this.altura = altura; }
    public double obtenerAltura() { return altura; }
    public void establecerPeso(double peso) { this.peso = peso; }
    public double obtenerPeso() { return peso; }
    public int calcularEdad() {
        return Period.between(LocalDate.of(anio, mes, dia), LocalDate.now()).getYears();
    }
    public int frecuenciaMaxima() { return 220 - calcularEdad(); }
    public double frecuenciaMinimaEsperada() { return frecuenciaMaxima() * 0.50; }
    public double frecuenciaMaximaEsperada() { return frecuenciaMaxima() * 0.85; }
    public double calcularIMC() {
        double metros = altura / 100.0;
        return metros > 0 ? peso / (metros * metros) : 0;
    }
}
