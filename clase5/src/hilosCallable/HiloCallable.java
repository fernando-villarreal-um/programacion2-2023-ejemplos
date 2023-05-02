package hilosCallable;

import java.util.concurrent.Callable;

public class HiloCallable implements Callable<Void> {
    protected String nombre;
    protected int demora;
    protected int iteraciones;

    public HiloCallable() {
    }

    public HiloCallable(String nombre, int demora, int iteraciones) {
        this.nombre = nombre;
        this.demora = demora;
        this.iteraciones = iteraciones;
    }

    @Override
    public Void call() throws Exception {
        System.out.println("Arranca el hilo");
        for(int i=0; i<this.iteraciones; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append("Hilo nombre: "+this.nombre);
            sb.append(" - iteracion: "+i+" de "+this.iteraciones);
            System.out.println(sb.toString());
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }
}
