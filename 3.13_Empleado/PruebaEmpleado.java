public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado primero = new Empleado("Juan", "Perez", 500);
        Empleado segundo = new Empleado("Ana", "Lopez", 700);
        System.out.printf("Antes: %s %s = $%.2f anual%n", primero.obtenerNombre(),
                primero.obtenerApellido(), primero.obtenerSalarioAnual());
        System.out.printf("Antes: %s %s = $%.2f anual%n", segundo.obtenerNombre(),
                segundo.obtenerApellido(), segundo.obtenerSalarioAnual());
        primero.establecerSalarioMensual(primero.obtenerSalarioMensual() * 1.10);
        segundo.establecerSalarioMensual(segundo.obtenerSalarioMensual() * 1.10);
        System.out.printf("Despues: Juan = $%.2f anual%n", primero.obtenerSalarioAnual());
        System.out.printf("Despues: Ana = $%.2f anual%n", segundo.obtenerSalarioAnual());
        primero.establecerSalarioMensual(-100);
        System.out.printf("Salario tras intento negativo: $%.2f mensual%n",
                primero.obtenerSalarioMensual());
    }
}
