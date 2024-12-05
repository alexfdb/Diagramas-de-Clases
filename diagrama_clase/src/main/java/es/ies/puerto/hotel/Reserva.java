package es.ies.puerto.hotel;
import java.util.Date;
import java.util.Objects;

public class Reserva {
    private Date fechaEntrada;
    private Date fechaSalida;
    private Cliente cliente;
    private Habitacion habitacion;

    public Reserva() {
    }

    public Reserva(Date fechaEntrada, Date fechaSalida, Cliente cliente, Habitacion habitacion) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public Date getFechaEntrada() {
        return this.fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return this.habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Reserva fechaEntrada(Date fechaEntrada) {
        setFechaEntrada(fechaEntrada);
        return this;
    }

    public Reserva fechaSalida(Date fechaSalida) {
        setFechaSalida(fechaSalida);
        return this;
    }

    public Reserva cliente(Cliente cliente) {
        setCliente(cliente);
        return this;
    }

    public Reserva habitacion(Habitacion habitacion) {
        setHabitacion(habitacion);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Reserva)) {
            return false;
        }
        Reserva reserva = (Reserva) o;
        return Objects.equals(fechaEntrada, reserva.fechaEntrada) && Objects.equals(fechaSalida, reserva.fechaSalida) && Objects.equals(cliente, reserva.cliente) && Objects.equals(habitacion, reserva.habitacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaEntrada, fechaSalida, cliente, habitacion);
    }

    @Override
    public String toString() {
        return "{" +
            " fechaEntrada='" + getFechaEntrada() + "'" +
            ", fechaSalida='" + getFechaSalida() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", habitacion='" + getHabitacion() + "'" +
            "}";
    }
    
}
