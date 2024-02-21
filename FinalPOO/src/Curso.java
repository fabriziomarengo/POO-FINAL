public class Curso extends OfertaAcademica {

    private int cargaHoraria;
    private int duracion;
    private double valorHora;

    public Curso(String nombre, String descripcion) {
        super(nombre, descripcion);
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
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
