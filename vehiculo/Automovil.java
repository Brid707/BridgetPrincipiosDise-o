

/**
 * Class Automovil
 */
public class Automovil extends Vehiculo {

    private int numAsientos;
    private int numPuertas;

    public Automovil(String marcaModelo, int precioDia, int numLlantas,
                     int numAsientos, int numPuertas) {

        super(marcaModelo, precioDia, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
    }

    public void mostrarDatos() {
        mostrarCaracteristicas();
        System.out.println("Número de asientos: " + numAsientos);
        System.out.println("Número de puertas: " + numPuertas);
    }

    public void pruebaDelMotor() {
        encenderMotor();
        funciona();
        apagarMotor();
    }
}
