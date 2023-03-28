package entidades;

public class Empleado extends Persona{
    protected String legajo;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String legajo) {
        super(nombre, apellido);
        this.legajo = legajo;
    }

    @Override
    public void hacerAlgo() {
        System.out.println("Metodo hacerAlgo del empleado");
    }

    public void funcionEmpleado() {
        System.out.println("Metodo función empleado");
    }
}
