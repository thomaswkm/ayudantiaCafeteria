package data;

import model.*;

import java.io.*;
import java.util.ArrayList;

public class GestorDatos {

    public static ArrayList<Boleta> cargarBoletas(String nombreArchivo) {
        ArrayList<Boleta> boletas = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(nombreArchivo);
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            boletas = (ArrayList<Boleta>) objectIn.readObject();
            System.out.println("Las boletas se cargaron correctamente desde el archivo.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar las boletas desde el archivo: " + e.getMessage());
        }
        return boletas;
    }
        public static void guardarBoletas(ArrayList<Boleta> boletas, String nombreArchivo) {
            try (FileOutputStream fileOut = new FileOutputStream(nombreArchivo);
                 ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
                objectOut.writeObject(boletas);
                System.out.println("Las boletas se guardaron correctamente en el archivo.");
            } catch (IOException e) {
                System.out.println("Error al guardar las boletas en el archivo: " + e.getMessage());
            }
        }
    }



