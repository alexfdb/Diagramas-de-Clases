package es.ies.puerto.biblioteca_a;
import java.sql.Date;
import java.util.Objects;
/**
 * @author alexfdb
 * @version 1.0.0
 */
public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaDevolucion;
    private Libro libro;
    private Miembro miembro;
    private boolean devuelto;

    /**
     * Constructor por defecto.
     */
    public Prestamo() {}

    /**
     * Constructor general.
     * @param fechaPrestamo
     * @param fechaDevolucion
     * @param libro
     * @param miembro
     * @param devuelto
     */
    public Prestamo(Date fechaPrestamo, Date fechaDevolucion, Libro libro, Miembro miembro, boolean devuelto) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.miembro = miembro;
        this.devuelto = devuelto;
    }

    public Date getFechaPrestamo() {
        return this.fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Miembro getMiembro() {
        return this.miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    public boolean getDevuelto() {
        return this.devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    /**
     * Función que calcula la multa por retraso.
     * @return
     */
    public float calcularMultaPorRetraso() {
        return 0.0f;
    }

    /**
     * Función que marca como devuelto.
     * @return
     */
    public boolean marcaComoDevuelto() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Prestamo)) return false;
        Prestamo prestamo = (Prestamo) o;
        return Objects.equals(fechaPrestamo, prestamo.fechaPrestamo) && 
               Objects.equals(fechaDevolucion, prestamo.fechaDevolucion) && 
               Objects.equals(libro, prestamo.libro) && 
               Objects.equals(miembro, prestamo.miembro) && 
                              devuelto == prestamo.devuelto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaPrestamo, fechaDevolucion, libro, miembro, devuelto);
    }

    @Override
    public String toString() {
        return "{" +
            " fechaPrestamo='" + getFechaPrestamo() + "'" +
            ", fechaDevolucion='" + getFechaDevolucion() + "'" +
            ", libro='" + getLibro() + "'" +
            ", miembro='" + getMiembro() + "'" +
            ", devuelto='" + getDevuelto() + "'" +
            "}";
    }
}
