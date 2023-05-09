import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private ArrayList<String> redesSociales;
    private ArrayList<Cafe> listaCafes;
    private ArrayList<Alfajor> listaAlfajores = new ArrayList<Alfajor>();

    public Cafeteria(String nombre, String direccion, ArrayList<String> redesSociales, ArrayList<Cafe> listaCafes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.redesSociales = redesSociales;
        this.listaCafes = listaCafes;
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


    public ArrayList<Cafe> buscarCafe(String tamano){
        ArrayList<Cafe> cafes = new ArrayList<>();
        for (Cafe cafe:listaCafes) {
            if(cafe.getTamano().equals(tamano)) {
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

    public ArrayList<Alfajor> buscarAlfajor(String tamano) {
        ArrayList<Alfajor> alfajores = new ArrayList<>();
        for (Alfajor alfajor: listaAlfajores) {
            if(alfajor.getTamano().equals(tamano)) {
                alfajores.add(alfajor);
            }
        }
        return alfajores;
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
}
