import java.util.Scanner;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Mes de nacimiento: ");
        int mes = entrada.nextInt();
        System.out.print("Dia de nacimiento: ");
        int dia = entrada.nextInt();
        System.out.print("Anio de nacimiento: ");
        int anio = entrada.nextInt();
        FrecuenciasCardiacas persona = new FrecuenciasCardiacas(nombre, apellido, mes, dia, anio);
        System.out.println("Nombre: " + persona.obtenerNombre() + " " + persona.obtenerApellido());
        System.out.printf("Nacimiento: %d/%d/%d%n", persona.obtenerMes(), persona.obtenerDia(), persona.obtenerAnio());
        System.out.println("Edad: " + persona.calcularEdad() + " anios");
        System.out.println("Frecuencia maxima: " + persona.frecuenciaMaxima() + " ppm");
        System.out.printf("Rango esperado: %.1f - %.1f ppm%n",
                persona.frecuenciaMinimaEsperada(), persona.frecuenciaMaximaEsperada());
        entrada.close();
    }
}
