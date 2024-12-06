package es.ies.puerto.biblioteca_a;
import java.util.List;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Bibliotecario {
    private String id;
    private List<Libro> libros;
    private Prestamo prestamo;

    /**
     * Constructor por defecto.
     */
    public Bibliotecario() {}

    /**
     * Constructor solo con el id.
     * @param id
     */
    public Bibliotecario(String id) {
        this.id = id;
    }

    /**
     * Constructor general.
     * @param id
     * @param libros
     * @param prestamo
     */
    public Bibliotecario(String id, List<Libro> libros, Prestamo prestamo) {
        this.id = id;
        this.libros = libros;
        this.prestamo = prestamo;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public Prestamo getPrestamo() {
        return this.prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    /**
     * Función que registra libros.
     * @return
     */
    public List<Libro> registroLibros() {
        return null;
    }

    /**
     * Función que gestiona un prestamo.
     * @return
     */
    public Prestamo gestionarPrestamo() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Bibliotecario)) return false;
        Bibliotecario bibliotecario = (Bibliotecario) o;
        return Objects.equals(id, bibliotecario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libros, prestamo);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", libros='" + getLibros() + "'" +
            ", prestamo='" + getPrestamo() + "'" +
            "}";
    }
}
