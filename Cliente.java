import java.time.LocalTime;

public class Cliente {

    private String nombre;
    private String identificacion;
    private String tipoTransaccion;
    private LocalTime horaLlegada;
    private boolean prioridad;

    public Cliente(String nombre,
                   String identificacion,
                   String tipoTransaccion,
                   LocalTime horaLlegada,
                   boolean prioridad) {
        setNombre(nombre);
        setIdentificacion(identificacion);
        this.tipoTransaccion = tipoTransaccion;
        this.horaLlegada = horaLlegada;
        this.prioridad = prioridad;
    }
    // VALIDAR NOMBRE
    public void setNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "El nombre no puede estar vacío"
            );
        }
        this.nombre = nombre;
    }
    // VALIDAR IDENTIFICACIÓN
    public void setIdentificacion(String identificacion) {
        if(!identificacion.matches("\\d+")) {
            throw new IllegalArgumentException(
                    "La identificación debe tener solo números"
            );
        }
        this.identificacion = identificacion;
    }
    // GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }
    public LocalTime getHoraLlegada() {
        return horaLlegada;
    }
    public boolean isPrioridad() {
        return prioridad;
    }
    // MOSTRAR DATOS
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", transaccion='" + tipoTransaccion + '\'' +
                ", hora=" + horaLlegada +
                '}';
    }
}