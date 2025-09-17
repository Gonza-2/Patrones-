package abstractfactory;

public class EnvioNormal implements MetodoEnvio{
    @Override
    public void enviar(String destino){
        System.out.println("Enviado a " + destino + " por metodo NORMAL");
    }
}
