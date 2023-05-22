import java.util.ArrayList;
import java.util.Collection;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private ArrayList<String> redesSociales;
    private ArrayList<Cafe> listaCafes; //cabe destacar que se está utlizando el arraylist como un "menú" y no como un inventario. Es decir,
    // un cliente puede ver que tipos de cafes existen, pero al comprar no se descuentan del array.
    private ArrayList<Alfajor> listaAlfajores; //misma dinámica que el arraylist de café.

    private ArrayList<Trabajador> listaTrabajadores;

    public Cafeteria(String nombre, String direccion, ArrayList<String> redesSociales, ArrayList<Cafe> listaCafes, ArrayList<Alfajor> listaAlfajores, ArrayList<Trabajador> listaTrabajadores) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.redesSociales = redesSociales;
        this.listaCafes = listaCafes;
        this.listaAlfajores = listaAlfajores;
        this.listaTrabajadores = listaTrabajadores;
    }

    public Cafeteria() {
    }

    public ArrayList<Cafe> getListaCafes() {
        return listaCafes;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setListaCafes(ArrayList<Cafe> listaCafes) {
        this.listaCafes = listaCafes;
    }

    public ArrayList<String> getRedesSociales() {
        return redesSociales;
    }

    public void agregarCafe(Cafe cafe){
        listaCafes.add(cafe);
    }

    public void eliminarCafe(int indice){
        listaCafes.remove(indice);
    }


    public ArrayList<Cafe> buscarCafe(String size){
        ArrayList<Cafe> cafes = new ArrayList<>();
        for (Cafe cafe:listaCafes) {
            if(cafe.getSize().equals(size)) {
                cafes.add(cafe);
            }
        }
        return cafes;
    }

    public void agregarRedSocial(String redSocial){
        redesSociales.add(redSocial);
    }


    public void agregarAlfajor(Alfajor alfajor) {
        listaAlfajores.add(alfajor);
    }

    public void eliminarAlfajor(int indice) {
        listaAlfajores.remove(indice);
    }

    public ArrayList<Alfajor> buscarAlfajor(String size) {
        ArrayList<Alfajor> alfajores = new ArrayList<>();
        for (Alfajor alfajor: listaAlfajores) {
            if(alfajor.getSize().equals(size)) {
                alfajores.add(alfajor);
            }
        }
        return alfajores;
    }

    public void agregarTrabajador(Trabajador trabajador){
        listaTrabajadores.add(trabajador);
    }
    public void eliminarTrabajador(int indice){
        listaTrabajadores.remove(indice);
    }

    @Override
    public String toString() {
        return "Cafeteria{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", redesSociales=" + redesSociales +
                ", listaCafes=" + listaCafes +
                '}';
    }

    public ArrayList<Trabajador> getListaTrabajadores() {
        return listaTrabajadores;
    }

    public ArrayList<Alfajor> getListaAlfajores() {
        return listaAlfajores;
    }
}
