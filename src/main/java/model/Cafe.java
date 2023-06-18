package model;

public class Cafe extends Producto {
    private double gramosCafe;
    private double mililitrosAgua;

    public Cafe(double gramosCafe, double mililitrosAgua, Size size) {
        super(size,Categoria.CAFE);
        this.gramosCafe = gramosCafe;
        this.mililitrosAgua = mililitrosAgua;

    }
    public Cafe() {
        super(null,Categoria.CAFE);
    }

    public String getTipo(){
        return "Café";
    }

    public double getGramosCafe() {
        return gramosCafe;
    }

    public double getMililitrosAgua() {
        return mililitrosAgua;
    }

    public String getSize() {
        return size.getSize();
    }

    @Override
    public String toString() {
        return "model.Cafe: " +
                gramosCafe + "gr " +
                mililitrosAgua + "ml " +
                "Tamaño: " + size.getSize();
    }

    public int getPrecio() {
        return switch (size.getSize()) {
            case "Pequeño" -> 5;
            case "Mediano" -> 10;
            case "Grande" -> 15;
            default -> 0;
        };
    }
}
