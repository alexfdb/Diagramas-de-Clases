package es.ies.puerto.hotel;
import java.util.List;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private int numeroContacto;
    private String correoElectronico;
    private List<Reserva> resrvas;

    public Cliente() {
    }

    public Cliente(String nombre, int numeroContacto, String correoElectronico) {
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.correoElectronico = correoElectronico;
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

    public Cliente nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Cliente numeroContacto(int numeroContacto) {
        setNumeroContacto(numeroContacto);
        return this;
    }

    public Cliente correoElectronico(String correoElectronico) {
        setCorreoElectronico(correoElectronico);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) && numeroContacto == cliente.numeroContacto && Objects.equals(correoElectronico, cliente.correoElectronico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroContacto, correoElectronico);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", numeroContacto='" + getNumeroContacto() + "'" +
            ", correoElectronico='" + getCorreoElectronico() + "'" +
            "}";
    }
    
}
