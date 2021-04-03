package ro.ase.cts.factoryMethod.clase;

public class Fundas extends Jucator {

    public Fundas(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
