import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {

    Cafeteria cafeteria;
    Cafe cafeUno;
    Cafe cafeDos;
    Cafe cafeTres;

    @BeforeEach
    void setUp() {
        cafeUno = new Cafe(5, 100, Size.PEQUENO);
        cafeDos = new Cafe(10, 150, Size.MEDIANO);
        cafeTres = new Cafe(15, 200, Size.GRANDE);

        ArrayList<Cafe> cafes = new ArrayList<>();
        cafes.add(cafeUno);
        cafes.add(cafeDos);

        cafeteria = new Cafeteria("nombrePrueba","direccionPrueba",new ArrayList<>(),cafes,null,null);

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

}