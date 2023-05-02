package prod_cons;

public class ArranquePC {

    public static void main(String[] args) {
        ArranquePC arranque = new ArranquePC();
        arranque.arranque();
    }

    public void arranque() {
        // Creamos una instancia del almacenamiento compartido
        Almacenamiento almacenamiento = new Almacenamiento();

        // Creamos una instancia del productor y lo iniciamos
        Productor productor = new Productor(almacenamiento);
        Thread hiloProductor = new Thread(productor);
        hiloProductor.start();

        // Creamos una instancia del consumidor y lo iniciamos
        Consumidor consumidor = new Consumidor(almacenamiento);
        Thread hiloConsumidor = new Thread(consumidor);
        hiloConsumidor.start();
    }
}
