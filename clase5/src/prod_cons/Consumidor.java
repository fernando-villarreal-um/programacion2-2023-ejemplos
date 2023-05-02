package prod_cons;

class Consumidor implements Runnable {
    private Almacenamiento almacenamiento;

    public Consumidor(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            int valor = almacenamiento.retirar();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}