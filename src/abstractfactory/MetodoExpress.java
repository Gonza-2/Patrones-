package abstractfactory;

public class MetodoExpress implements MetodoEnvio{
    @Override
    public void enviar(String destino){
        System.out.println("Enviado a " + destino + " por metodo EXPRESS");
    }
}
