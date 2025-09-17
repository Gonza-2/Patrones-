package singleton;
import factory.Libro;
import java.util.ArrayList;

public class Database {
    private ArrayList<factory.Libro> libros;

    private Database() {
        this.libros = new ArrayList<>();

    }

    private static class Holder{
        static final Database INSTANCIA = new Database();
    }

    public static Database getInstancia(){
        return Holder.INSTANCIA;
    }

    public void agregarLibro(factory.Libro libro){
        libros.add(libro);
    }

    public void listarLibros(){
        if (libros.isEmpty()){
            System.out.println("No hay libros en la bilbioteca.");
            return;
        } else System.out.println("Libros en la biblioteca:");
        for (Libro libro : libros){
            libro.mostrarInfo();
        }
    }
}