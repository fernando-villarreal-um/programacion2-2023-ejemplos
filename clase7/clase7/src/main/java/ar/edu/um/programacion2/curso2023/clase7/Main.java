package ar.edu.um.programacion2.curso2023.clase7;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();
    }

    public void arranque() {
        Persona persona = new Persona();
        Persona persona1 = new Persona("Carlos", "Rojas",true, 1, "33333333");
        persona.setApellido("Perez");
        persona.setDni("wefwerwe");
    }
}