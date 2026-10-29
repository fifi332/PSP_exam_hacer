package ejercicio2;

public class Main {
    static void main(String[] args) {
        ContadorCompartido contadorGlobal = new ContadorCompartido();

        Hilo hilo1 = new Hilo(contadorGlobal);
        Hilo hilo2= new Hilo(contadorGlobal);
        Hilo hilo3 = new Hilo(contadorGlobal);
        Hilo hilo4 = new Hilo(contadorGlobal);

        Thread h1 = new Thread(hilo1, "hilo1");
        Thread h2 = new Thread(hilo2, "hilo2");
        Thread h3 = new Thread(hilo3, "hilo3");
        Thread h4 = new Thread(hilo4, "hilo4");

        h1.start();
        h2.start();
        h3.start();
        h4.start();

        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
        } catch (InterruptedException e) {
            System.err.println("Error en el espera de los hilos: " + e.getMessage());
        }


    }
}
