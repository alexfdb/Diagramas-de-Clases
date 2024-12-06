package es.ies.puerto.biblioteca_b;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class SalaLectura {
    private String nombre;
    private int capacidad;

    /**
     * Constructor por defecto.
     */
    public SalaLectura() {
    }

    /**
     * Constructor general.
     * @param nombre
     * @param capacidad
     */
    public SalaLectura(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Función que reserva una sala.
     * @return
     */
    public boolean reservarSala() {
        return false;
    }

    /**
     * Función que verifica la disponibilidad.
     * @return
     */
    public boolean verificarDisponibilidad() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SalaLectura)) return false;
        SalaLectura salaLectura = (SalaLectura) o;
        return Objects.equals(nombre, salaLectura.nombre) && 
                              capacidad == salaLectura.capacidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, capacidad);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", capacidad='" + getCapacidad() + "'" +
            "}";
    }
}
