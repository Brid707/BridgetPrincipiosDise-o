

/**
 * Class Autobus
 */
public class Autobus extends Vehiculo {

    private int numAsientos;
    private int numPuertas;
    private int numVentilas;

    public Autobus(String marcaModelo, int precioDia, int numLlantas,
                   int numAsientos, int numPuertas, int numVentilas) {

        super(marcaModelo, precioDia, numLlantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.numVentilas = numVentilas;
    }

    public void mostrarDatos() {
        mostrarCaracteristicas();
        System.out.println("Número de asientos: " + numAsientos);
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Número de ventilas: " + numVentilas);
    }

    public void pruebaDelMotor() {
        encenderMotor();
        funciona();
        apagarMotor();
    }
}

