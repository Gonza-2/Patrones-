package prototype;
import java.time.LocalDate;

public class Prestamo implements Cloneable{
    private String libro;
    private String usuario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Prestamo(String libro, String usuario, LocalDate fechaInicio, LocalDate fechaFin){
        this.libro = libro;
        this.usuario = usuario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public String getLibro(){
        return libro;
    }
    public void setLibro(String libro){
        this.libro = libro;
    }

    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public LocalDate getFechaInicio(){
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio){
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin(){
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin){
        this.fechaFin = fechaFin;
    }

    // Método clone(): crea una copia superficial (shallow copy)

    public Prestamo clone(){
        try{
            return (Prestamo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString(){
        return "Préstamo{" +
                "libro='" + libro + '\'' +
                ", usuario='" + usuario + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}
