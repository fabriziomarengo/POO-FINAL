import java.util.ArrayList;

public class Programa extends OfertaAcademica {

    private double descuento;
    private ArrayList<OfertaAcademica> ofertas;

    public Programa(String nombre, String descripcion) {
        super(nombre, descripcion);
        descuento = 10.0;
        ofertas = new ArrayList<>();
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void agregarOferta(OfertaAcademica oferta) {
        ofertas.add(oferta);
    }

    @Override
    public double calcularPrecio() {
        return 0;
    }

    @Override
    public String mostrar() {
        return null;
    }
}
