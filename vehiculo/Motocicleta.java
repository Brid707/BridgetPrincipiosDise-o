

/**
 * Class Motocicleta
 */
public class Motocicleta extends Vehiculo {

    private int numAsientos;

    public Motocicleta(String marcaModelo, int precioDia, int numLlantas,
                       int numAsientos) {

        super(marcaModelo, precioDia, numLlantas);
        this.numAsientos = numAsientos;
    }

    public void mostrarDatos() {
        mostrarCaracteristicas();
        System.out.println("Número de asientos: " + numAsientos);
    }

    public void pruebaDelMotor() {
        encenderMotor();
        funciona();
        apagarMotor();
    }
}
