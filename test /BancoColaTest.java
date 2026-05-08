import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;
public class BancoColaTest {
    @Test
    public void pruebaEncolar() {
        BancoCola banco = new BancoCola();
        Cliente c = new Cliente(
                "Juan",
                "12345",
                "Pago",
                LocalTime.now(),
                false
        );
        banco.agregarCliente(c);
        assertEquals(1, banco.cantidadClientes());
    }
    @Test
    public void pruebaDesencolar() {
        BancoCola banco = new BancoCola();
        Cliente c = new Cliente(
                "Ana",
                "999",
                "Retiro",
                LocalTime.now(),
                false
        );
        banco.agregarCliente(c);
        Cliente atendido = banco.atenderCliente();
        assertEquals("Ana", atendido.getNombre());
    }
    @Test
    public void pruebaColaVacia() {
        BancoCola banco = new BancoCola();
        assertTrue(banco.estaVacia());
    }
}
