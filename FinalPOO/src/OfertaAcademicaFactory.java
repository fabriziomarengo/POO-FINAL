public class OfertaAcademicaFactory {

    private static OfertaAcademicaFactory instancia;
    private final static String FRONTEND = "F";
    private final static String BACKEND = "B";
    private final static String FULLSTACK = "FS";

    private OfertaAcademicaFactory() {

    }

    public OfertaAcademicaFactory obtenerInstancia() {
        if (instancia == null) {
            instancia = new OfertaAcademicaFactory();
        }
        return instancia;
    }

    public OfertaAcademica crearOfertaAcadem(String codigo, String nombre, String descripcion) {
        // Empleado empleado;
        return switch (codigo) {
            case "F", "B" -> new Curso(nombre, descripcion);
            case "FS" -> new Programa(nombre, descripcion);
            default -> null;
        };
    }

}
