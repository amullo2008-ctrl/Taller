public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(10, 13, 2026);
        System.out.print("Fecha original: ");
        fecha.mostrarFecha();
        fecha.establecerDia(20);
        fecha.establecerMes(12);
        System.out.print("Fecha modificada: ");
        fecha.mostrarFecha();
    }
}
