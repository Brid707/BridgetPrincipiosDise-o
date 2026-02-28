public class MainISP {

    public static void main(String[] args) {

        Humano humano = new Humano();
        Robot robot = new Robot();

        humano.trabajar();
        humano.comer();

        robot.trabajar();
    }
}
