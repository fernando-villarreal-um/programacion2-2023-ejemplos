package ejemplos;

public class Arranque {
    public static void main(String[] args) {
        Arranque a = new Arranque();
        a.arrancar();
    }

    public void arrancar() {
        Hilo1 h1 = new Hilo1("hilo nro 1",1500,6);
        h1.start();
        Hilo1 h2 = new Hilo1("hilo nro 2",300,20);
        h2.start();
        Hilo2 h3_i = new Hilo2("hilo implementado 1", 500,10);
        Thread h3 = new Thread(h3_i);
        h3.start();
    }

}

