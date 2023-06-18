package model;

public class Galleta extends Producto {
    private String nombre;

    public Galleta(String nombre, Size size) {
        super(size,Categoria.GALLETA);
        this.nombre = nombre;
    }

    public Galleta() {
        super(null, Categoria.GALLETA);
    }
    public String getTipo(){
        return "model.Galleta";
    }
    public String getNombre() {
        return nombre;
    }
    @Override
    public int getPrecio() {
        return 0;
    }
}
