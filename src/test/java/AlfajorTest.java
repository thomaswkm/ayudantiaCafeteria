import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlfajorTest {
    Alfajor a;
    @BeforeEach
    void setUp() {
        a = new Alfajor("Blanco", "Grande", "Manjar");
    }

    @Test
    void getColor() {
        assertEquals("Blanco",a.getColor());
    }

    @Test
    void getTamano() {
        assertEquals("Grande",a.getTamano());
    }

    @Test
    void getRelleno() {
        assertEquals("Manjar",a.getRelleno());
    }

}