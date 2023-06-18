import model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {

    Cafeteria cafeteria;
    Cafe cafeUno;
    Cafe cafeDos;
    Cafe cafeTres;
    Alfajor alfajor;
    Trabajador trabajador;


    @BeforeEach
    void setUp() {
        cafeUno = new Cafe(5, 100, Size.PEQUENO);
        cafeDos = new Cafe(10, 150, Size.MEDIANO);
        cafeTres = new Cafe(15, 200, Size.GRANDE);

        ArrayList<Producto> productos = new ArrayList<>();
        ArrayList<Trabajador> trabajadores = new ArrayList<>();


        productos.add(cafeUno);
        productos.add(cafeDos);

        alfajor = new Alfajor("Blanco",Size.GRANDE,"Manjar");
        trabajador = new Trabajador(RolTrabajador.BARISTA,"nombre",1);


        cafeteria = new Cafeteria("nombrePrueba","direccionPrueba",new ArrayList<>(),productos,trabajadores,new ArrayList<>());

    }


    @Test
    void agregarCafeTest() {
        cafeteria.agregarCafe(cafeTres);
        assertTrue(cafeteria.getListaCafes().contains(cafeTres));
    }

    @Test
    void eliminarCafeTest() {
        cafeteria.eliminarCafe(0);
        assertFalse(cafeteria.getListaCafes().contains(cafeUno));
    }

    @Test
    void buscarCafeTest() {
        assertEquals(1, cafeteria.buscarCafePorTamaño(cafeteria.getListaCafes(),"Pequeño").size());
        assertEquals(1, cafeteria.buscarCafePorTamaño(cafeteria.getListaCafes(),"Mediano").size());
        assertEquals(0, cafeteria.buscarCafePorTamaño(cafeteria.getListaCafes(),"Grande").size());
    }

    @Test
    void agregarRedSocialTest() {
        String rs = "Test: www.test.com";
        cafeteria.agregarRedSocial(rs);
        assertTrue(cafeteria.getRedesSociales().contains(rs));
    }

    @Test
    void agregarAlfajorTest(){
        cafeteria.agregarAlfajor(alfajor);
        assertTrue(cafeteria.getListaAlfajores().contains(alfajor));
    }

    @Test
    void agregarTrabajadorTest(){
        cafeteria.agregarTrabajador(trabajador);
        assertTrue(cafeteria.getListaTrabajadores().contains(trabajador));

    }

}