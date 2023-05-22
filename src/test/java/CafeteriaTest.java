import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {

    Cafeteria cafeteria;
    Cafe cafeUno;
    Cafe cafeDos;
    Cafe cafeTres;
    Alfajor a;
    Trabajador t;


    @BeforeEach
    void setUp() {
        cafeUno = new Cafe(5, 100, Size.PEQUENO);
        cafeDos = new Cafe(10, 150, Size.MEDIANO);
        cafeTres = new Cafe(15, 200, Size.GRANDE);

        ArrayList<Cafe> cafes = new ArrayList<>();
        ArrayList<Trabajador> trabajadores = new ArrayList<>();
        ArrayList<Alfajor> alfajores = new ArrayList<>();


        cafes.add(cafeUno);
        cafes.add(cafeDos);

        a = new Alfajor("Blanco",Size.GRANDE,"Manjar");
        t = new Trabajador(RolTrabajador.BARISTA,"nombre",1);


        cafeteria = new Cafeteria("nombrePrueba","direccionPrueba",new ArrayList<>(),cafes,alfajores,trabajadores);

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
        assertEquals(1, cafeteria.buscarCafe("Pequeño").size());
        assertEquals(1, cafeteria.buscarCafe("Mediano").size());
        assertEquals(0, cafeteria.buscarCafe("Grande").size());
    }

    @Test
    void agregarRedSocialTest() {
        String rs = "Test: www.test.com";
        cafeteria.agregarRedSocial(rs);
        assertTrue(cafeteria.getRedesSociales().contains(rs));
    }

    @Test
    void agregarAlfajorTest(){
        cafeteria.agregarAlfajor(a);
        assertTrue(cafeteria.getListaAlfajores().contains(a));
    }

    @Test
    void agregarTrabajadorTest(){
        cafeteria.agregarTrabajador(t);
        assertTrue(cafeteria.getListaTrabajadores().contains(t));

    }

}