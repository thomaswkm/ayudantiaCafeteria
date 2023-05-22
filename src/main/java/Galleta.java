public class Galleta {
    private Categoria categoria;
    private String nombre;

    public Galleta(String nombre) {
        this.categoria = Categoria.GALLETA;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
