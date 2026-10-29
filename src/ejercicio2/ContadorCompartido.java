package ejercicio2;

public class ContadorCompartido {
    private int total = 0;

    public synchronized void sumarContador(){
        int contador = 0;
        this.total+=contador;
    }

    public synchronized int getTotalContador(){
        return total;
    }
}
