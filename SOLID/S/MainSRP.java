public class MainSRP {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Ana", "ana@email.com");

        UsuarioRepository repository = new UsuarioRepository();
        EmailService emailService = new EmailService();

        repository.guardar(usuario);
        emailService.enviarBienvenida(usuario);
    }
}
