public class Main {

    public static void main(String[] args) {

        Estudiante e1 = new Estudiante(
                "Ana", 20, "Femenino",
                12345, 9.5, "Ingeniería"
        );

        e1.datosDeAlumno();

        System.out.println("------------------");

        Docente d1 = new Docente(
                "Carlos", 40, "Masculino",
                7890, 15000.0, "Sistemas"
        );

        d1.datosDocente();
    }
}
