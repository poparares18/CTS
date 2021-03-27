package ro.ase.cts.simpleFactory.clase;

public class Atacant extends Jucator {

    public Atacant(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
