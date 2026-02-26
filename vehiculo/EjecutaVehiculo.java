

/**
 * Class EjecutaVehiculo
 */
public class EjecutaVehiculo {

    public static void main(String[] args) {

        // Automóvil
        Automovil v1 = new Automovil("Volvo 550", 120, 4, 5, 4);
        v1.mostrarDatos();
        v1.pruebaDelMotor();

        System.out.println("------------------");

        // Moto
        Motocicleta m1 = new Motocicleta("Italika", 120, 2, 2);
        m1.mostrarDatos();
        m1.pruebaDelMotor();

        System.out.println("------------------");

        // Autobús
        Autobus b1 = new Autobus("Mercedes", 300, 8, 42, 2, 2);
        b1.mostrarDatos();
        b1.pruebaDelMotor();
    }
}
