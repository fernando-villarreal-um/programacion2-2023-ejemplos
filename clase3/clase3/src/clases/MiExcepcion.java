package clases;

public class MiExcepcion extends Exception{

    public MiExcepcion() {
        super("Texto genérico de excepción");
    }

    public MiExcepcion(String message) {
        super(message);
    }
}
