public class MainLSP {

    public static void main(String[] args) {

        Zoologico zoologico = new Zoologico();

        Ave pato = new Pato();
        Ave aguila = new Aguila();

        zoologico.hacerSonarAve(pato);
        zoologico.hacerSonarAve(aguila);
    }
}
