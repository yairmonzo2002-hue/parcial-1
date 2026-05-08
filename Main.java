import java.time.LocalTime;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BancoCola banco = new BancoCola();
        int opcion;
        do {
            System.out.println("\n=== SISTEMA DE COLA DEL BANCO ===");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Atender cliente");
            System.out.println("3. Ver siguiente cliente");
            System.out.println("4. Mostrar cola");
            System.out.println("5. Cantidad de clientes");
            System.out.println("6. Vaciar cola");
            System.out.println("7. Salir");
            System.out.print("Seleccione: ");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese un número válido.");
                sc.next();
            }
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion) {
                case 1:
                    try {
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Identificación: ");
                        String id = sc.nextLine();
                        System.out.print("Tipo transacción: ");
                        String tipo = sc.nextLine();
                        System.out.print("Hora (HH:MM): ");
                        String horaTexto = sc.nextLine();
                        LocalTime hora = LocalTime.parse(horaTexto);
                        Cliente cliente = new Cliente(
                                nombre,
                                id,
                                tipo,
                                hora,
                                false
                        );
                        banco.agregarCliente(cliente);
                        System.out.println("Cliente agregado.");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    Cliente atendido = banco.atenderCliente();
                    if(atendido == null) {
                        System.out.println("No hay clientes.");
                    } else {
                        System.out.println("Atendiendo:");
                        System.out.println(atendido);
                    }
                    break;
                case 3:
                    Cliente siguiente = banco.verSiguiente();
                    if(siguiente == null) {
                        System.out.println("No hay clientes.");
                    } else {
                        System.out.println(siguiente);
                    }
                    break;
                case 4:
                    banco.mostrarClientes();
                    break;
                case 5:
                    System.out.println(
                            "Clientes en espera: "
                                    + banco.cantidadClientes()
                    );
                    break;
                case 6:
                    banco.vaciarCola();
                    System.out.println("Cola vaciada.");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while(opcion != 7);
        sc.close();
    }
}