package es.ies.puerto.biblioteca_a;
import java.util.List;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Miembro {
    private String id;
    private List<Prestamo> historialPrestamos;

    /**
     * Constructor por defecto.
     */
    public Miembro() {}

    /**
     * Constructor solo con el id.
     * @param id
     */
    public Miembro(String id) {
        this.id = id;
    }

    /**
     * Constructor general.
     * @param id
     * @param historialPrestamos
     */
    public Miembro(String id, List<Prestamo> historialPrestamos) {
        this.id = id;
        this.historialPrestamos = historialPrestamos;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Prestamo> getHistorialPrestamos() {
        return this.historialPrestamos;
    }

    public void setHistorialPrestamos(List<Prestamo> historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

    /**
     * Función que registra un miembro.
     * @return
     */
    public boolean registrarMiembro() {
        return false;
    }

    /**
     * Función que muestra el historial.
     * @return
     */
    public List<Prestamo> verHistorial() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Miembro)) return false;
        Miembro miembro = (Miembro) o;
        return Objects.equals(id, miembro.id);
        }

    @Override
    public int hashCode() {
        return Objects.hash(id, historialPrestamos);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", historialPrestamos='" + getHistorialPrestamos() + "'" +
            "}";
    }
}
