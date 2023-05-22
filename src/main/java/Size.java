public enum Size {
    PEQUENO("Pequeño"),
    MEDIANO("Mediano"),
    GRANDE("Grande");

    private String size;
    Size(String size) {
        this.size = size;
    }

    public String getSize(){
        return size;
    }
}