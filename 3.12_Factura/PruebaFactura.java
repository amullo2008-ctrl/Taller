public class PruebaFactura {
    public static void main(String[] args) {
        Factura factura = new Factura("P001", "Martillo", 3, 8.50);
        System.out.printf("Caso 1 - %s (%s): %d x $%.2f = $%.2f%n",
                factura.obtenerDescripcion(), factura.obtenerNumeroPieza(),
                factura.obtenerCantidad(), factura.obtenerPrecio(), factura.obtenerMontoFactura());
        factura.establecerCantidad(-5);
        System.out.printf("Caso 2 - Cantidad negativa: %d, total: $%.2f%n",
                factura.obtenerCantidad(), factura.obtenerMontoFactura());
        factura.establecerCantidad(2);
        factura.establecerPrecio(-9);
        System.out.printf("Caso 3 - Precio negativo: $%.2f, total: $%.2f%n",
                factura.obtenerPrecio(), factura.obtenerMontoFactura());
    }
}
