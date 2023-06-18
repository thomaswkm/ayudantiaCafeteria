package model;

public class Trabajador {

    private RolTrabajador rol;
    private String nombre;
    private int id;

    public Trabajador(RolTrabajador rol, String nombre, int id) {
        this.rol = rol;
        this.nombre = nombre;
        this.id = id;
    }

    public String getRol() {
        return rol.getRolTrabajador();
    }

    public void setRol(RolTrabajador rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "model.Trabajador{" +
                "rol=" + rol +
                ", nombre='" + nombre + '\'' +
                ", id=" + id +
                '}';
    }
}