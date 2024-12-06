package es.ies.puerto.hotel;
import java.util.List;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Cliente {
    private String nombre;
    private int numeroContacto;
    private String correoElectronico;
    private List<Reserva> reservas;

    /**
     * Constructor por defecto.
     */
    public Cliente() {}

    /**
     * Constructor general.
     * @param nombre
     * @param numeroContacto
     * @param correoElectronico
     * @param resrvas
     */
    public Cliente(String nombre, int numeroContacto, String correoElectronico, List<Reserva> resrvas) {
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.correoElectronico = correoElectronico;
        this.reservas = resrvas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroContacto() {
        return this.numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(List<Reserva> resrvas) {
        this.reservas = resrvas;
    }

    /**
     * Funcíon para registrar un cliente.
     * @return
     */
    public boolean registrarCliente() {
        return false;
    }

    /**
     * Función para obtener información.
     * @return
     */
    public String obtenerInformacion() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) && 
                              numeroContacto == cliente.numeroContacto && 
               Objects.equals(correoElectronico, cliente.correoElectronico) && 
               Objects.equals(reservas, cliente.reservas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroContacto, correoElectronico, reservas);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", numeroContacto='" + getNumeroContacto() + "'" +
            ", correoElectronico='" + getCorreoElectronico() + "'" +
            ", resrvas='" + getReservas() + "'" +
            "}";
    }
}