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

    public void comprar(Cafe cafe){
        if(this.dinero>=cafe.getCosto()){
            dinero -= cafe.getCosto();
            System.out.println("El cliente "+this.nombre+ " ha comprado un "+cafe);
            System.out.println("Costo: "+cafe.getCosto());
        }else{
            System.out.println("Dinero insuficiente");
        }
    }

    public void comprar(Alfajor alfajor){
        if(this.dinero>=alfajor.getCosto()){
            dinero -= alfajor.getCosto();
            System.out.println("El cliente "+this.nombre+ " ha comprado un "+alfajor);
            System.out.println("Costo: "+alfajor.getCosto());
        }else{
            System.out.println("Dinero insuficiente");
        }
    }
}
