public class MainDIP {

    public static void main(String[] args) {

        Notificacion email = new EmailNotificacion();
        ServicioAlerta servicio = new ServicioAlerta(email);

        servicio.alertar("Sistema activo");
    }
}

