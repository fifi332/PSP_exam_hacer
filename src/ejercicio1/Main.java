package ejercicio1;

import java.util.ArrayList;


public class Main {
    static void main() throws InterruptedException {

        ArrayList<Thread> hilos = new ArrayList<>();

        for (int i = 21; i > 1; i--) {

            Thread activar = new Thread(new Hilo(), "Hilo " + (i - 1));
            activar.start();

            Thread.sleep(500);

            hilos.add(activar);

        }

        for (Thread t : hilos) {
            t.join();
        }
        System.out.println("Terminado");
    }
}