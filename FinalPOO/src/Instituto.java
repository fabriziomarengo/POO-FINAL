import java.util.ArrayList;

public class Instituto {

    private String nombre;
    private ArrayList<OfertaAcademica> paquetes;

    public Instituto(String nombre) {
        this.nombre = nombre;
        paquetes = new ArrayList<>();
    }

    public String generarInforme() {
        return "";
    }
}
