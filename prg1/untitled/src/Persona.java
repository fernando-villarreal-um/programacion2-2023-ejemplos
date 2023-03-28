public class Persona {
    protected String nombre;
    protected String apellido;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona() {}

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String datos() {
        String datos = "";
        datos=datos+"Nombre: "+this.nombre;
        return datos;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }
}
