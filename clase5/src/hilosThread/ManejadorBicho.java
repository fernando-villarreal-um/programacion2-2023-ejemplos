package hilosThread;

import servicios.Bicho;

public class ManejadorBicho implements Runnable{
    protected Bicho bicho;
    protected int velocidad;
    protected boolean activo=true;

    public ManejadorBicho() {
    }

    public ManejadorBicho(Bicho bicho) {
        this.bicho = bicho;
        this.velocidad = (int) Math.round(Math.random()*100);
    }

    public ManejadorBicho(Bicho bicho, int velocidad) {
        this.bicho = bicho;
        this.velocidad = velocidad;
    }

    @Override
    public void run() {
        //System.out.println("ARRANCANDO");
        while(activo) {
            this.bicho.mover();
            try {
                Thread.sleep(this.velocidad);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Bicho getBicho() {
        return bicho;
    }

    public void setBicho(Bicho bicho) {
        this.bicho = bicho;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        StringBuffer mensaje = new StringBuffer();
        mensaje.append("Bicho: "+this.bicho.toString());
        mensaje.append(" - Velocidad: "+this.velocidad);
        mensaje.append(" - Activo: "+this.activo);
        return mensaje.toString();
    }
}
