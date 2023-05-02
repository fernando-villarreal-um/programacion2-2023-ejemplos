package hilosCallable;

import java.util.concurrent.Callable;

public class HiloCallable2 implements Callable<String> {
    protected String nombre;
    protected int demora;
    protected int iteraciones;

    protected boolean mostrar;

    public HiloCallable2() {
    }

    public HiloCallable2(String nombre, int demora, int iteraciones) {
        this.nombre = nombre;
        this.demora = demora;
        this.iteraciones = iteraciones;
        this.mostrar = true;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Arranca el hilo: "+this.nombre);
        for(int i=0; i<this.iteraciones; i++) {
            StringBuffer sb = new StringBuffer();
            sb.append("Hilo nombre: "+this.nombre);
            sb.append(" - iteracion: "+i+" de "+this.iteraciones);
            if(this.mostrar) {
                System.out.println(sb.toString());
            }
            try {
                Thread.sleep(this.demora);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return "hilo "+this.nombre+" finalizado";
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

    public boolean isMostrar() {
        return mostrar;
    }

    public void setMostrar(boolean mostrar) {
        this.mostrar = mostrar;
    }
}
