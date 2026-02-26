

/**
 * Class Vehiculo
 */
public class Vehiculo {

    protected int precioDia;
    protected String marcaModelo;
    protected int numLlantas;

    public Vehiculo(String marcaModelo, int precioDia, int numLlantas) {
        this.marcaModelo = marcaModelo;
        this.precioDia = precioDia;
        this.numLlantas = numLlantas;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Marca y modelo: " + marcaModelo);
        System.out.println("Precio por día: " + precioDia);
        System.out.println("Número de llantas: " + numLlantas);
    }

    public void encenderMotor() {
        System.out.println("Motor encendido");
    }

    public void apagarMotor() {
        System.out.println("Motor apagado");
    }

    public void funciona() {
        System.out.println("El vehículo está funcionando correctamente.");
    }
}
