package ejercicio2;

class Hilo implements Runnable {
    ContadorCompartido contador;
    int numero;
    String texto;
    int resultado = 0;

    Hilo(ContadorCompartido c, int numero, String texto) {
        contador = c;
        this.numero = numero;
        this.texto = texto;
    }

    public Hilo(ContadorCompartido contadorGlobal) {

    }

    public void run() {
        for (int i = 0; i < texto.length(); i++) {
            if (numero == texto(i)){
                contador.sumarContador();
            }
        }
        contador.sumarContador();
        System.out.println(numero + ": " + resultado);
    }

    private int texto(int i) {
        return i;
    }
}