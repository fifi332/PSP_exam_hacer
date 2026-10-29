package ejercicio1;

public class Trabajar {
    public static synchronized void trabajando() {

        for (int i = 0; i < 9; i++) {
            System.out.println("Soy el " + Thread.currentThread().getName() + " - Iteracion" + i);

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.err.println("El hilo fue interrumpido " + e.getMessage());
            }
        }
    }
}
