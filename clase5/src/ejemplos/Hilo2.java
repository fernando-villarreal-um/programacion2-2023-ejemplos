package ejemplos;

public class Hilo2 implements Runnable {
    protected String nombre;
    protected int demora;

    protected int iteraciones;

    protected int contador=0;
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
        Thread.currentThread().interrupt();
        System.out.println("Contador: "+this.contador);
        this.contador++;
        if(this.contador>10) {
            System.out.println("Vamos a interrumpir el hilo porque se ejecutó mas de 10 veces");
            Thread.currentThread().interrupt();
        }
    }
}
