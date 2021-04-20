package ro.ase.cts.strategy.clase;

public class PlataCash implements ModPlata {

    @Override
    public void plateste(int suma) {
        System.out.println("A fost platita suma cash de " + suma);
    }
}
