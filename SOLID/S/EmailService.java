// Responsabilidad: Notificaciones
public class EmailService {

    public void enviarBienvenida(Usuario usuario) {
        System.out.println("Enviando email a " + usuario.getEmail());
    }
}
