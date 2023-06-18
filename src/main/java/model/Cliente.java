package model;

import java.util.Random;
public class Cliente {
    private String nombre;
    private int dinero;

    public Cliente() {
        this.dinero = new Random().nextInt(0,100);

    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

}
