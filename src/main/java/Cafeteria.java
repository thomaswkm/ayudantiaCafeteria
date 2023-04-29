import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private ArrayList<String> redesSociales;
    private ArrayList<Cafe> listaCafes;

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

    public void setListaCafes(ArrayList<Cafe> listaCafes) {
        this.listaCafes = listaCafes;
    }

    public Cafe agregarCafe(Cafe cafe){
        listaCafes.add(cafe);
        return cafe;
    }

    public int eliminarCafe(int indice){
        listaCafes.remove(indice);
        return indice;
    }

    public ArrayList<Cafe> buscarCafe(String tamano){
        ArrayList<Cafe> cafes = new ArrayList<>();
        for (Cafe cafe:listaCafes) {
            cafes.add(cafe);
        }
        return cafes;
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
