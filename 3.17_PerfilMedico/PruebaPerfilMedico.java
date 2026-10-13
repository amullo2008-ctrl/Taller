import java.util.Scanner;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Sexo: ");
        String sexo = entrada.nextLine();
        System.out.print("Dia: ");
        int dia = entrada.nextInt();
        System.out.print("Mes: ");
        int mes = entrada.nextInt();
        System.out.print("Anio: ");
        int anio = entrada.nextInt();
        System.out.print("Altura en cm: ");
        double altura = entrada.nextDouble();
        System.out.print("Peso en kg: ");
        double peso = entrada.nextDouble();
        PerfilMedico p = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);
        System.out.println("Nombre: " + p.obtenerNombre() + " " + p.obtenerApellido());
        System.out.println("Sexo: " + p.obtenerSexo());
        System.out.printf("Nacimiento: %d/%d/%d%n", p.obtenerDia(), p.obtenerMes(), p.obtenerAnio());
        System.out.printf("Altura: %.1f cm | Peso: %.1f kg%n", p.obtenerAltura(), p.obtenerPeso());
        System.out.println("Edad: " + p.calcularEdad() + " anios");
        System.out.printf("IMC: %.2f%n", p.calcularIMC());
        System.out.println("Frecuencia maxima: " + p.frecuenciaMaxima() + " ppm");
        System.out.printf("Rango esperado: %.1f - %.1f ppm%n", p.frecuenciaMinimaEsperada(), p.frecuenciaMaximaEsperada());
        System.out.println("TABLA IMC (adultos)");
        System.out.println("Bajo peso: menos de 18.5");
        System.out.println("Normal: 18.5 a menos de 25");
        System.out.println("Sobrepeso: 25 a menos de 30");
        System.out.println("Obeso: 30 o mas");
        entrada.close();
    }
}
