public class Factura {
    private String numeroPieza;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(String numeroPieza, String descripcion, int cantidad, double precio) {
        this.numeroPieza = numeroPieza;
        this.descripcion = descripcion;
        establecerCantidad(cantidad);
        establecerPrecio(precio);
    }
    public void establecerNumeroPieza(String numeroPieza) { this.numeroPieza = numeroPieza; }
    public String obtenerNumeroPieza() { return numeroPieza; }
    public void establecerDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String obtenerDescripcion() { return descripcion; }
    public void establecerCantidad(int cantidad) { this.cantidad = Math.max(0, cantidad); }
    public int obtenerCantidad() { return cantidad; }
    public void establecerPrecio(double precio) { this.precio = precio > 0 ? precio : 0.0; }
    public double obtenerPrecio() { return precio; }
    public double obtenerMontoFactura() { return cantidad * precio; }
}
