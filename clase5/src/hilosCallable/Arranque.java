package hilosCallable;

import ejemplos.Hilo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Arranque {

    public static void main(String[] args) {
        Arranque a = new Arranque();
        //a.arranque();
        //a.arranque2();
        //a.arranque3();
        a.arranque4();
    }

    public void arranque() {
        ExecutorService executorService = Executors.newFixedThreadPool(20);
        for(int i = 0; i < 10; i++) {
            HiloCallable hc = new HiloCallable("hilo: "+i,100,10);
            executorService.submit(hc);
        }
        executorService.shutdown();
        HiloCallable hc = new HiloCallable("hilo: ",100,10);
        //executorService.submit(hc);
    }

    public void arranque2() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        HiloCallable2 hc = new HiloCallable2("hilo1",1500,50);
        Future<String> resultado = executorService.submit(hc);
        try {
            resultado.get();
            System.out.println("Finalizó");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        /*
        while(resultado.isDone()) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            System.out.println("Resultado de la ejecución: "+resultado.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

         */

        executorService.shutdown();
    }

    public void arranque3() {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        List<Future> resultados = new ArrayList<>();
        int iteraciones = 10;
        for(int i = 0; i < iteraciones; i++) {
            Random aleatorio = new Random(System.currentTimeMillis());
            HiloCallable2 hc = new HiloCallable2("hilo: "+i,aleatorio.nextInt(900)+100,aleatorio.nextInt(5)+10);
            //hc.setMostrar(false);
            Future<String> resultado = executorService.submit(hc);
            resultados.add(resultado);
        }
        boolean continuar = true;

        while(continuar) {
            if(resultados.size()==0) {
                continuar=false;
            }
            for(int i = 0; i < resultados.size(); i++) {
                if(resultados.get(i).isDone()) {
                    try {
                        System.out.println("Resultado de ejecución: "+resultados.get(i).get());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (ExecutionException e) {
                        throw new RuntimeException(e);
                    }
                    resultados.remove(i);
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        executorService.shutdown();
    }

    public void arranque4() {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        Hilo2 hilo = new Hilo2("hilo repetitivo",400,2);
        executorService.scheduleAtFixedRate(hilo,2,2,TimeUnit.SECONDS);
    }


}
