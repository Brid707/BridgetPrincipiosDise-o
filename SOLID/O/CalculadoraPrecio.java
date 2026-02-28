public class CalculadoraPrecio {

    public double calcularPrecio(double precio, Descuento descuento) {
        return descuento.aplicarDescuento(precio);
    }
}
