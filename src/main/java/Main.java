import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cafeteria c = crearCafeteria();
        System.out.println(c);
        Cafe cf = crearCafe();
        c.agregarCafe(cf);
        System.out.println(c);
    }
    public static Cafeteria crearCafeteria() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la cafeteria: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa la dirección de la cafetería: ");
        String direccion = sc.nextLine();
        return new Cafeteria(nombre, direccion, new ArrayList<>(), new ArrayList<>());
    }

    public static Cafe crearCafe() {
        return new Cafe(devolverGramosCafe(), devolverMl(), devolverTamano(ingresarTamano()));
    }

    public static String devolverTamano(int ans) {
        switch(ans){
            case 1: return "Pequeño";
            case 2: return "Mediano";
            case 3: return "Grande";
        }
        return "";
    }

    public static int ingresarTamano() {
        Scanner sc = new Scanner(System.in);
        menuTamanos();
        int ans;
        try{
            ans = sc.nextInt();
        }catch (InputMismatchException ime){
            System.out.println("Ingresa un número válido.");
            return ingresarTamano();
        }
        return ans;
    }



    public static void menuTamanos(){
        System.out.println("""
                Ingresa el tamaño del café:
                1. Pequeño
                2. Mediano
                3. Grande                
                """);
    }

    public static double devolverGramosCafe() {
        Scanner sc = new Scanner(System.in);
        double gramos = 0;
        System.out.println("Ingresa la cantidad de gramos de café:");
        try {
            gramos = sc.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Ingresa un número");
            sc.nextLine();
            return devolverGramosCafe();
        }
        return gramos;
    }

    public static double devolverMl() {
        Scanner sc = new Scanner(System.in);
        double ml = 0;
        System.out.println("Ingresa la cantidad de mililitros de agua: ");
        try {
            ml = sc.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("Ingresa un número");
            sc.nextLine();
            return devolverMl();
        }
        return ml;
    }

}
