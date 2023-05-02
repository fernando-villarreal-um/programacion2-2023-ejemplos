package clases;

public class MiExcepcionHija extends MiExcepcion{

    public MiExcepcionHija() {
        super("Texto genérico de excepción MiExcepcionHija");
    }

    public MiExcepcionHija(String message) {
        super(message);
    }
}
