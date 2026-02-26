

/**
 * Class Main
 */
public class Main {

    public static void main(String[] args) {

        Auto auto = new Auto("Toyota");

        Persona persona = new Persona("Adolfo", auto);

        persona.mostrarAuto();
    }
}
