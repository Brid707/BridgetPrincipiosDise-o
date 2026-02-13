public class Avion {

    public String aerolinea;
    private String cantidadMotores;
    protected String velocidad;
    public String capacidad;
    private String modelo; 

    public Avion(String aerolinea, String cantidadDeMotores,
                 String velocidad, String capacidad) {

        this.aerolinea = aerolinea;
        this.cantidadMotores = cantidadDeMotores;
        this.velocidad = velocidad;
        this.capacidad = capacidad;

        System.out.println("Construyo un avion");
    }

    public void acelerar() {
        System.out.println("El avion acelero");
    }

    public void elevarse() {
        System.out.println("El avion se elevo");
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }
}

