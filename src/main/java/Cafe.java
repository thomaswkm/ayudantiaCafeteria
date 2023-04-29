public class Cafe {
    private double gramosCafe;
    private double mililitrosAgua;
    private String tamano;

    public Cafe(double gramosCafe, double mililitrosAgua, String tamano) {
        this.gramosCafe = gramosCafe;
        this.mililitrosAgua = mililitrosAgua;
        this.tamano = tamano;

    }

    public Cafe() {
    }

    public double getGramosCafe() {
        return gramosCafe;
    }

    public double getMililitrosAgua() {
        return mililitrosAgua;
    }

    public String getTamano() {
        return tamano;
    }

    @Override
    public String toString() {
        return "Cafe: " +
                gramosCafe + "gr " +
                mililitrosAgua + "ml " +
                "Tamaño: " + tamano;
    }
}
