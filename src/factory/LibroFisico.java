package factory;

public class LibroFisico extends Libro {

    public LibroFisico(String titulo, String autor){
        super(titulo,autor);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Libro fisico " + titulo + " | autor: " + autor );
    }

}

