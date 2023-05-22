import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeTest {
    Cafe c;
    @BeforeEach
    void setUp() {
            c = new Cafe(10, 200, Size.GRANDE);
    }

    @Test
    void getGramosCafe() {
        assertEquals(10,c.getGramosCafe());
    }

    @Test
    void getMililitrosAgua() {
        assertEquals(200,c.getMililitrosAgua());
    }

    @Test
    void getTamano() {
        assertEquals("Grande",c.getSize());
    }

    @Test
    void testToString() {
        assertEquals("Cafe: 10.0gr 200.0ml Tamaño: Grande",c.toString());
    }
}