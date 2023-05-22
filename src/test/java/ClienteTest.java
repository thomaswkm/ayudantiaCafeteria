import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente();
        cliente.setDinero(50); //solo para caso de prueba se establecerá un dinero no random.
    }

    @Test
    void comprarTest(){
        Cafe c = new Cafe(10,15,Size.GRANDE);
        cliente.comprar(c);
        assertEquals(35,cliente.getDinero());
    }
}