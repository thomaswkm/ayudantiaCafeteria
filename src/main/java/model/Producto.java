package model;

public abstract class Producto {

    protected Size size;
    protected Categoria categoria;

    public Producto(Size size, Categoria categoria) {
        this.size = size;
        this.categoria = categoria;
    }

    public abstract String getTipo();

    public abstract int getPrecio();

    public String getSize(){
        return size.toString();
    }
}
