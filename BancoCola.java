import java.util.LinkedList;
import java.util.Queue;

public class BancoCola {

    private Queue<Cliente> cola;
    public BancoCola() {
        cola = new LinkedList<>();
    }
    public void agregarCliente(Cliente cliente) {
        cola.offer(cliente);
    }
    public Cliente atenderCliente() {
        if(cola.isEmpty()) {
            return null;
        }
        return cola.poll();
    }
    public Cliente verSiguiente() {
        if(cola.isEmpty()) {
            return null;
        }
        return cola.peek();
    }
    public void mostrarClientes() {
        if(cola.isEmpty()) {
            System.out.println("No hay clientes en espera.");
            return;
        }
        for(Cliente c : cola) {
            System.out.println(c);
        }
    }
    public int cantidadClientes() {
        return cola.size();
    }
    public boolean estaVacia() {
        return cola.isEmpty();
    }
    public void vaciarCola() {
        cola.clear();
    }
}