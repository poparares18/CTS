package ro.ase.cts.simpleFactory.clase;

public abstract class Jucator {
    private String nume;
    private int varsta;

    public Jucator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
