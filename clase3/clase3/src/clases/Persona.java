package clases;

public class Persona {
    protected String nombre;
    protected String apellido;
    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void moverPersona() {
        System.out.println("funcion moverPersona en Persona: "+this.nombre);
    }

    public void mover() {
        System.out.println("funcion mover en Persona: "+this.nombre);
    }

    @Override
    public boolean equals(Object p) {
        Persona pers = (Persona)p;
        if(this.nombre.equals(pers.getNombre()) && this.apellido.equals(pers.getApellido())) {
            return true;
        }
        return false;
    }
}
