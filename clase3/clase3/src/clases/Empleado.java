package clases;

import java.util.Objects;

public class Empleado extends Persona implements Comparable<Empleado>{
    protected String legajo;
    protected int aniosTrabajados;

    public Empleado(String legajo) {
        super();
        this.legajo = legajo;
    }

    public Empleado(String nombre, String apellido, String legajo, int aniosTrabajados) {
        super(nombre, apellido);
        this.legajo = legajo;
        this.aniosTrabajados = aniosTrabajados;
    }

    @Override
    public void mover() {
        System.out.println("funcion mover en Empleado: "+this.nombre);
    }

    public void moverEmpleado() {
        System.out.println("funcion moverEmpleado en Empleado: "+this.nombre);
    }

    @Override
    public String toString() {
        String resultado = "Empleado - nombre: " + this.nombre
                +" - apellido: "+this.apellido
                +" - legajo: "+this.legajo
                +" - años: "+this.aniosTrabajados;
        return resultado;
    }

    @Override
    public int compareTo(Empleado o) {
        return this.aniosTrabajados - o.getAniosTrabajados();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return this.apellido.equals(empleado.getApellido())
                && this.nombre.equals(empleado.getNombre())
                && this.legajo.equals(empleado.getLegajo())
                && this.aniosTrabajados== empleado.getAniosTrabajados();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, legajo, aniosTrabajados);
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public int getAniosTrabajados() {
        return aniosTrabajados;
    }

    public void setAniosTrabajados(int aniosTrabajados) {
        this.aniosTrabajados = aniosTrabajados;
    }
}
