package es.ies.puerto.biblioteca_b;
import java.util.List;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Editorial {
    private String nombre;
    private String direccion;
    private String contacto;

    /**
     * Constructor por defecto.
     */
    public Editorial() {
    }

    /**
     * Constructor genreal.
     * @param nombre
     * @param direccion
     * @param contacto
     */
    public Editorial(String nombre, String direccion, String contacto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto() {
        return this.contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * Función para registrar una editorial.
     * @return
     */
    public boolean registrarEditorial() {
        return false;
    }

    /**
     * Función que lista los libros de una editorial.
     * @return
     */
    public List<Libro> listarLibrosDeEditorial() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Editorial)) return false;
        Editorial editorial = (Editorial) o;
        return Objects.equals(nombre, editorial.nombre) && 
               Objects.equals(direccion, editorial.direccion) && 
               Objects.equals(contacto, editorial.contacto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, direccion, contacto);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", contacto='" + getContacto() + "'" +
            "}";
    }
}
