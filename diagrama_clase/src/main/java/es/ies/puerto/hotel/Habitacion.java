package es.ies.puerto.hotel;
import java.util.List;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Habitacion {
    private int numeroHabitacion;
    private String tipoHabitacion;
    private float precioNoche;
    private List<Reserva> reservas;
    private boolean disponibilidad;

    /**
     * Constructor vacio.
     */
    public Habitacion() {}

    /**
     * Constructor general.
     * @param numeroHabitacion
     * @param tipoHabitacion
     * @param precioNoche
     * @param reservas
     * @param disponibilidad
     */
    public Habitacion(int numeroHabitacion, String tipoHabitacion, float precioNoche, List<Reserva> reservas, boolean disponibilidad) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioNoche = precioNoche;
        this.reservas = reservas;
        this.disponibilidad = disponibilidad;
    }

    public int getNumeroHabitacion() {
        return this.numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return this.tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public float getPrecioNoche() {
        return this.precioNoche;
    }

    public void setPrecioNoche(float precioNoche) {
        this.precioNoche = precioNoche;
    }

    public List<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean isDisponibilidad() {
        return this.disponibilidad;
    }

    public boolean getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Habitacion)) return false;
        Habitacion habitacion = (Habitacion) o;
        return numeroHabitacion == habitacion.numeroHabitacion && 
        Objects.equals(tipoHabitacion, habitacion.tipoHabitacion) && 
                       precioNoche == habitacion.precioNoche && 
        Objects.equals(reservas, habitacion.reservas) && 
                       disponibilidad == habitacion.disponibilidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroHabitacion, tipoHabitacion, precioNoche, reservas, disponibilidad);
    }

    @Override
    public String toString() {
        return "{" +
            " numeroHabitacion='" + getNumeroHabitacion() + "'" +
            ", tipoHabitacion='" + getTipoHabitacion() + "'" +
            ", precioNoche='" + getPrecioNoche() + "'" +
            ", reservas='" + getReservas() + "'" +
            ", disponibilidad='" + isDisponibilidad() + "'" +
            "}";
    }

}
