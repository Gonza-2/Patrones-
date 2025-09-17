package builder;
import java.time.LocalDate;

public class Usuario {
    private final String nombre;
    private final String email;
    private final String direccion;
    private final String telefono;
    private final LocalDate fechaNacimiento;

private Usuario(Builder builder) {
    this.nombre = builder.nombre;
    this.email = builder.email;
    this.direccion = builder.direccion;
    this.telefono = builder.telefono;
    this.fechaNacimiento = builder.fechaNacimiento;
}

    public String getNombre(){
    return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString(){
        return "Usuario {" + "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                (direccion != null ? ", dirección='" + direccion + '\'' : "") +
                (telefono != null ? ", teléfono='" + telefono + '\'' : "") +
                (fechaNacimiento != null ? ", fechaNacimiento=" + fechaNacimiento : "") +
                '}';
    }
    // Clase Builder (interna y estática)
    public static class Builder {
        private String nombre;
        private String email;
        private String direccion;
        private String telefono;
        private LocalDate fechaNacimiento;

        // Constructor del Builder (recibe atributos obligatorios)
    public Builder(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
        }

    public Builder direccion(String direccion){
        this.direccion = direccion;
        return this;
        }

    public Builder telefono(String telefono){
        this.telefono = telefono;
        return this;
        }

    public Builder fechaNacimiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
        return this;
        }

        // Método build() para crear el Usuario
    public Usuario build(){
        return new Usuario(this);
       }
    }
}
