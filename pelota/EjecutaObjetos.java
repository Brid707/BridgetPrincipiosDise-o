

/**
 * Class EjecutaObjetos
 */
public class EjecutaObjetos {

    public static void main(String[] args) {

        Pelota p1 = new Pelota("Redonda", "Rojo", "Cuero", "Futbol");
        p1.botar();
        p1.desinflar();

        Pelota p2 = new Pelota("Redonda", "Azul", "Plastico", "Basquet");
        p2.botar();
        p2.desinflar();
    }
}
