package ejercicio1;


public class Hilo implements Runnable {

    @Override
    public void run() {
        Trabajar.trabajando();
    }
}

