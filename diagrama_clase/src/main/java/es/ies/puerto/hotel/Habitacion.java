package es.ies.puerto.hotel;
import java.util.List;
import java.util.Objects;

public class Habitacion {
    private int numeroHabitacion;
    private String tipoHabitacion;
    private float precioNoche;
    private List<Reserva> reservas;

    public Habitacion() {
    }

    public Habitacion(int numeroHabitacion, String tipoHabitacion, float precioNoche) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioNoche = precioNoche;
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

    public Habitacion numeroHabitacion(int numeroHabitacion) {
        setNumeroHabitacion(numeroHabitacion);
        return this;
    }

    public Habitacion tipoHabitacion(String tipoHabitacion) {
        setTipoHabitacion(tipoHabitacion);
        return this;
    }

    public Habitacion precioNoche(float precioNoche) {
        setPrecioNoche(precioNoche);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Habitacion)) {
            return false;
        }
        Habitacion habitacion = (Habitacion) o;
        return numeroHabitacion == habitacion.numeroHabitacion && Objects.equals(tipoHabitacion, habitacion.tipoHabitacion) && precioNoche == habitacion.precioNoche;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroHabitacion, tipoHabitacion, precioNoche);
    }

    @Override
    public String toString() {
        return "{" +
            " numeroHabitacion='" + getNumeroHabitacion() + "'" +
            ", tipoHabitacion='" + getTipoHabitacion() + "'" +
            ", precioNoche='" + getPrecioNoche() + "'" +
            "}";
    }
    
}
