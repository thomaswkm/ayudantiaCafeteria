package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Boleta {
    private final String nombreEstablecimiento;
    private final ArrayList<Producto> productos;
    private final int total;
    private final String nombreTrabajador;
    private final int idTrabajador;
    private final LocalDateTime fecha;


    public Boleta(String nombreEstablecimiento, ArrayList<Producto> productos, int total, Trabajador trabajador, LocalDateTime fecha) {
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.productos = productos;
        this.total = total;
        this.nombreTrabajador = trabajador.getNombre();
        this.idTrabajador = trabajador.getId();
        this.fecha = fecha;
    }

    public int[] getDia(){
        return new int[]{fecha.getDayOfYear(),fecha.getYear()};
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "nombreEstablecimiento='" + nombreEstablecimiento + '\'' +
                ", productos=" + productos +
                ", total=" + total +
                ", nombreTrabajador='" + nombreTrabajador + '\'' +
                ", idTrabajador=" + idTrabajador +
                ", fecha=" + fecha +
                '}';
    }
}
