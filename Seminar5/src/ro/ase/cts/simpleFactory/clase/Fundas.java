package ro.ase.cts.simpleFactory.clase;

public class Fundas extends Jucator {

    public Fundas(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
