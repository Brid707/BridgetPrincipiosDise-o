public class MainOCP {

    public static void main(String[] args) {

        CalculadoraPrecio calculadora = new CalculadoraPrecio();

        Descuento descuentoNavidad = new DescuentoNavidad();
        double precioFinal = calculadora.calcularPrecio(100, descuentoNavidad);

        System.out.println("Precio final: " + precioFinal);
    }
}
