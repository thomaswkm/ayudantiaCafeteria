package model;

public enum Categoria {
    CAFE("model.Cafe"),
    ALFAJOR("model.Alfajor"),
    GALLETA("model.Galleta");

    private String categoria;

    Categoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria(){
        return categoria;
    }
}
