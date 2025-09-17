package abstractfactory;

public interface AbstractFactory {
    InterfazUI crearInterfazUI(); // Crea una interfaz de usuario
    MetodoEnvio crearMetodoEnvio();  // Crea un método de envío
}
