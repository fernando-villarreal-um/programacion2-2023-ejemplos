package clases;

public class MiExcepcion extends Exception{

    public MiExcepcion() {
        super("Texto genérico de excepción MiExcepcion");
    }

    public MiExcepcion(String message) {
        super(message);
    }
}
