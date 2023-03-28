import entidades.Persona;
import obreros.Lijador;
import obreros.Pintor;

public class Arranque {

    public static void main(String[] args) {
        Arranque arranque = new Arranque();
        arranque.arrancar();
    }

    public void arrancar() {
        System.out.println("Vamos a pintar una pared");
        Pintor pintor = new Pintor();
        Lijador lijador = new Lijador();
        boolean resultadoPintar = pintor.sePuedePintar(false);
        if(true) {
        }

        if(!resultadoPintar) {
            System.out.println("La pared no se puede pintar");
            boolean resultadoLijar = lijador.sePuedeLijar(true);
            if(resultadoLijar ) {
                // Se puede lijar
            }
            else {
                // No se puede lijar
            }
        }
    }
}
