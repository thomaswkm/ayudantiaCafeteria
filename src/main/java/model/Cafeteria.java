package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private ArrayList<String> redesSociales;
    private ArrayList<Producto> productos;
    private ArrayList<Trabajador> listaTrabajadores;
    private ArrayList<Boleta> boletas;


    public Cafeteria(String nombre, String direccion, ArrayList<String> redesSociales, ArrayList<Producto> productos, ArrayList<Trabajador> listaTrabajadores, ArrayList<Boleta> boletas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.redesSociales = redesSociales;
        this.listaTrabajadores = listaTrabajadores;
        this.productos = productos;
        this.boletas = boletas;
    }

    public Cafeteria() {
    }

    public ArrayList<Cafe> getListaCafes() {
        ArrayList<Cafe> cafes = new ArrayList<Cafe>();
        for (Producto producto: this.productos) {
            if(producto.getTipo().equals("Café")){
                cafes.add((Cafe) producto);
            }
        }
        return cafes;
    }

    public ArrayList<String> getRedesSociales() {
        return redesSociales;
    }

    public ArrayList<Boleta> getBoletas() {
        return boletas;
    }

    public void agregarCafe(Cafe cafe){
        productos.add(cafe);
    }

    public void eliminarCafe(int indice){
        productos.remove(indice);
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }


    public ArrayList<Cafe> buscarCafePorTamaño(ArrayList<Cafe> listaCafes, String size){
        ArrayList<Cafe> cafesCoinciden = new ArrayList<>();
        for (Cafe cafe:listaCafes) {
            if(cafe.getSize().equals(size)) {
                cafesCoinciden.add(cafe);
            }
        }
        return cafesCoinciden;
    }

    public ArrayList<Alfajor> getListaAlfajores(){
        ArrayList<Alfajor> alfajores = new ArrayList<>();
        for(Producto producto : this.productos){
            if(producto.getTipo().equals("model.Alfajor")){
                alfajores.add((Alfajor) producto);
            }
        }
        return alfajores;
    }

    public void agregarRedSocial(String redSocial){
        redesSociales.add(redSocial);
    }


    public void agregarAlfajor(Alfajor alfajor) {
        productos.add(alfajor);
    }

    public void eliminarAlfajor(int indice) {
        productos.remove(indice);
    }

    public ArrayList<Alfajor> buscarAlfajorPorTamaño(ArrayList<Alfajor> listaAlfajores, String size) {
        ArrayList<Alfajor> alfajoresCoinciden = new ArrayList<>();
        for (Alfajor alfajor: listaAlfajores) {
            if(alfajor.getSize().equals(size)) {
                alfajoresCoinciden.add(alfajor);
            }
        }
        return alfajoresCoinciden;
    }

    public void agregarTrabajador(Trabajador trabajador){
        listaTrabajadores.add(trabajador);
    }
    public void eliminarTrabajador(int indice){
        listaTrabajadores.remove(indice);
    }

    public boolean realizarVenta(Trabajador trabajador, Cliente cliente, ArrayList<Producto> productos){
        if(cliente.getDinero()>=calcularTotal(productos)) {
            cliente.setDinero(cliente.getDinero() - calcularTotal(productos));
            boletas.add(new Boleta(this.nombre, productos, calcularTotal(productos), trabajador, LocalDateTime.now()));
            return true;
        }else{
            return false;
        }
    }

    public int calcularTotal(ArrayList<Producto> productos) {
        int total = 0;
        for (Producto p: productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public ArrayList<Boleta> getVentasDia() {
        ArrayList<Boleta> ventasDia = new ArrayList<>();
        for (Boleta b: this.boletas) {
            if(b.getDia()[0]==LocalDateTime.now().getDayOfYear() && b.getDia()[1]==LocalDateTime.now().getYear()){
                ventasDia.add(b);
            }
        }
        return ventasDia;
    }

    @Override
    public String toString() {
        return "model.Cafeteria{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", redesSociales=" + redesSociales +
                ", productos=" + productos +
                '}';
    }
}
