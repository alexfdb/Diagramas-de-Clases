package es.ies.puerto.biblioteca_b;
import java.util.List;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Categoria {
    private String nombre;
    private String descripcion;
    private List<Libro> libros;

    /**
     * Constructor por defecto.
     */
    public Categoria() {
    }

    /**
     * Constructor general.
     * @param nombre
     * @param descripcion
     * @param libros
     */
    public Categoria(String nombre, String descripcion, List<Libro> libros) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.libros = libros;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Libro> getLibros() {
        return this.libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Función que agrega a una categoria.
     * @return
     */
    public boolean agregarCategoria() {
        return false;
    }

    /**
     * Función que lista libros por categoria.
     * @return
     */
    public List<Libro> listarLibrosPorCategoria() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Categoria)) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(nombre, categoria.nombre) && 
               Objects.equals(descripcion, categoria.descripcion) && 
               Objects.equals(libros, categoria.libros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion, libros);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", libros='" + getLibros() + "'" +
            "}";
    }
    
}
