package hilos;

public class Hilo2 implements Runnable{
    protected String nombre;
    protected int demora;
    public Hilo2() {}

    public Hilo2(String nombre, int demora) {
        this.nombre = nombre;
        this.demora = demora;
    }

    @Override
    public void run() {
        for(int i=0; i < 10; i++) {
            System.out.println("Hilo "+this.nombre);
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
