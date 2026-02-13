public class Pelota {

    
    public String forma;
    private String color;
    protected String material;
    public String tipo;

    public Pelota(String forma, String color, String material, String tipo) {
        this.forma = forma;
        this.color = color;
        this.material = material;
        this.tipo = tipo;

        System.out.println("Construyo una pelota");
    }

   
    public void botar() {
        System.out.println("La pelota esta botando");
    }

    public void desinflar() {
        System.out.println("Pelota ya se desinflo");
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getForma() {
        return forma;
    }
}
