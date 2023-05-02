import hilos.Hilo1;
import hilos.Hilo2;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.ejecutar();
    }

    public void ejecutar() {
        Hilo1 h1 = new Hilo1("extends 1",500);
        h1.start();
        Hilo2 h2_implements = new Hilo2("implements 1", 900);
        Thread h2 = new Thread(h2_implements);
        h2.start();
    }
}