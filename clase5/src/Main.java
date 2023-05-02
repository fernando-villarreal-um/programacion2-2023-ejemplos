import hilosThread.CreadorBichos;
import hilosThread.ManejadorPantalla;
import servicios.Pantalla;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.arranque();
    }

    public void arranque() {
        int x=120;
        int y=30;
        Pantalla p = new Pantalla(x,y);
        ManejadorPantalla manejadorPantalla = new ManejadorPantalla(p, 50);
        Thread t = new Thread(manejadorPantalla);
        t.start();

        CreadorBichos creador = new CreadorBichos(manejadorPantalla,40,150);
        creador.setMinX(3);
        creador.setMaxX(x-3);
        creador.setMinY(3);
        creador.setMaxY(y-3);
        Thread creadorBichos = new Thread(creador);
        creadorBichos.start();
        /*
        Bicho b1 = new Bicho();
        Bicho b2 = new Bicho(20,10,'o','O');
        Bicho b3 = new Bicho(30,5,'e','E');
        Bicho b4 = new Bicho(34,5,'n','N');
        Bicho b5 = new Bicho(30,5,'s','S');
        manejadorPantalla.agregarBicho(b2,400);
        manejadorPantalla.agregarBicho(b3,700);
        manejadorPantalla.agregarBicho(b4,1400);
        manejadorPantalla.agregarBicho(b5,1200);
        */
        try {
            Thread.sleep(20000);
            manejadorPantalla.setContinuar(false);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}