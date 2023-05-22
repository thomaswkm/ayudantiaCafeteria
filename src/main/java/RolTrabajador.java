public enum RolTrabajador {
    BARISTA("Barista"),
    MESERO("Mesero"),
    COCINERO("Cocinero");

    private String rolTrabajador;
    RolTrabajador(String rolTrabajador) {
        this.rolTrabajador = rolTrabajador;
    }

    public String getRolTrabajador() {
        return rolTrabajador;
    }
}
