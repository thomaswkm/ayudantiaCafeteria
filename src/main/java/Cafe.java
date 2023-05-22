public class Cafe {
    private double gramosCafe;
    private double mililitrosAgua;
    private Size size;
    private Categoria categoria;

    public Cafe(double gramosCafe, double mililitrosAgua, Size size) {
        this.gramosCafe = gramosCafe;
        this.mililitrosAgua = mililitrosAgua;
        this.size = size;
        categoria = Categoria.CAFE;

    }

    public Cafe() {
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
        return "Cafe: " +
                gramosCafe + "gr " +
                mililitrosAgua + "ml " +
                "Tamaño: " + size.getSize();
    }

    public int getCosto() {
        return switch (size.getSize()) {
            case "Pequeño" -> 5;
            case "Mediano" -> 10;
            case "Grande" -> 15;
            default -> 0;
        };
    }
}
