public class ServicioAlerta {

    private final Notificacion notificacion;

    // Inyección por constructor
    public ServicioAlerta(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void alertar(String mensaje) {
        notificacion.enviar(mensaje);
    }
}
