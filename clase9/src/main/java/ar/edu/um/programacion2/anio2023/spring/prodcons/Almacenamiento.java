package ar.edu.um.programacion2.anio2023.spring.prodcons;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.Queue;

@Service
public class Almacenamiento {
    private Queue<Integer> cola;
    private int capacidad;

    public Almacenamiento() {
        cola = new LinkedList<>();
        capacidad = 5;
    }

    public synchronized void agregar(int valor) {
        while (cola.size() == capacidad) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        cola.add(valor);
        System.out.println("Productor agrega " + valor + " en la cola.");
        notifyAll();
    }

    public synchronized int retirar() {
        while (cola.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int valor = cola.remove();
        System.out.println("Consumidor retira " + valor + " de la cola.");
        notifyAll();
        return valor;
    }
}
