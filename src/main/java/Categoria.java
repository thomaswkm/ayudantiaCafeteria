public enum Categoria {
    CAFE("Cafe"),
    ALFAJOR("Alfajor"),
    GALLETA("Galleta");

    private String categoria;

    Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria(){
        return categoria;
    }
}
