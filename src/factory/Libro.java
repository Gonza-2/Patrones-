package factory;

public abstract class Libro {

    protected String titulo;
    protected String autor;

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public abstract void mostrarInfo();
}