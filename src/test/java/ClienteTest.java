import model.Cliente;
import org.junit.jupiter.api.BeforeEach;

class ClienteTest {

    Cliente cliente;

    @BeforeEach
    void setUp() {
        cliente = new Cliente();
        cliente.setDinero(50); //solo para caso de prueba se establecerá un dinero no random.
    }
}