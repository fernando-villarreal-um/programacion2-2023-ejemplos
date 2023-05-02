package ejemplos;

public class Hilo2 implements Runnable {
    protected String nombre;
    protected int demora;

    protected int iteraciones;

    public Hilo2() {}

    public Hilo2(String nombre, int demora, int iteraciones) {
        this.nombre = nombre;
        this.demora = demora;
        this.iteraciones = iteraciones;
    }

    @Override
    public void run() {
        System.out.println("Arranca el hilo");
        for (int i = 0; i < this.iteraciones; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append("Hilo nombre: " + this.nombre);
            sb.append(" - iteracion: " + i + " de " + this.iteraciones);
            System.out.println(sb.toString());
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
