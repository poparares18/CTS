package ro.ase.cts.chainofresponsibility.clase;

public abstract class Cont {

    private float sold;
    private Cont cont;

    public Cont(float sold) {
        this.sold = sold;
        this.cont = null;
    }

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public Cont getCont() {
        return cont;
    }

    public void setCont(Cont cont) {
        this.cont = cont;
    }

    public abstract void realizeazaPlata(float suma);
}
