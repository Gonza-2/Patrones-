import builder.Usuario;
import factory.Libro;
import prototype.Prestamo;
import singleton.Database;
import factory.LogisticaLibro;
import abstractfactory.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Database biblioteca1 = Database.getInstancia();
    Database biblioteca2 = Database.getInstancia();

        System.out.println("¿Son la misma instancia?" + (biblioteca1 == biblioteca2));

    Libro libro1 = LogisticaLibro.crearLibro("fisico", "Cien años de soledad", "Gabriel Garcia Marquez");
    Libro libro2 = LogisticaLibro.crearLibro("digital","La Divina Comedia","Dante Alguieri");

    biblioteca1.agregarLibro(libro1);
    biblioteca2.agregarLibro(libro2);

    biblioteca1.listarLibros();

        System.out.println("====Libros Creados====");
        libro1.mostrarInfo();
        libro2.mostrarInfo();

        AbstractFactory adminFactory = new AdminFactory();
        InterfazUI adminUI = adminFactory.crearInterfazUI();
        MetodoEnvio adminEnvio = adminFactory.crearMetodoEnvio();

        AbstractFactory usuarioFactory = new UsuarioFactory();
        InterfazUI usuarioUI = usuarioFactory.crearInterfazUI();
        MetodoEnvio usuarioEnvio = usuarioFactory.crearMetodoEnvio();

        System.out.println("=== ADMINISTRADOR ===");
        adminUI.mostrar();
        adminEnvio.enviar("Buenos Aires");

        System.out.println("=== USUARIO ===");
        usuarioUI.mostrar();
        usuarioEnvio.enviar("La ");

        Usuario usuario1 = new Usuario.Builder("Angel Gerónimo", "angel2005@gmail.com")
                .build();

        Usuario usuario2 = new Usuario.Builder("Gonzalo Gerónimo", "gonzalodavidgeronimo15@gmail.com")
                .direccion("jenne 948")
                .fechaNacimiento(LocalDate.of(2004,8,28))
                .telefono("2966547092")
                .build();

        System.out.println(usuario1);
        System.out.println(usuario2);

        Prestamo prestamoOriginal = new Prestamo("El Principito", "Usuario 1", LocalDate.of(2025,8,28),LocalDate.of(2025,9,10));

        Prestamo prestamo1 = prestamoOriginal.clone();
        Prestamo prestamo2 = prestamoOriginal.clone();

        prestamo1.setLibro("el Quijote");
        prestamo2.setUsuario("usuario 2");

        System.out.println(prestamoOriginal);
        System.out.println(prestamo1);
        System.out.println(prestamo2);


    }
}
