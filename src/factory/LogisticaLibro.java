package factory;

public class LogisticaLibro {
    //facory method: crea un libro según el tipo

    public static Libro crearLibro(String tipo, String titulo, String autor){
        switch (tipo.toLowerCase()){
            case "fisico":
                return new LibroFisico(titulo, autor);
            case "digital":
                return new LibroDigital(titulo, autor);
            default:
                throw new IllegalArgumentException("Tipo desconocido" + tipo);
        }
    }
}
