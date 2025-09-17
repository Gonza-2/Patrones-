package factory;

public class LibroDigital extends Libro{

    public LibroDigital (String titulo, String autor){
        super(titulo,autor);
    }

    @Override
    public void mostrarInfo(){
        System.out.println("libro Digital " + titulo + "| autor: " + autor);
    }
}
