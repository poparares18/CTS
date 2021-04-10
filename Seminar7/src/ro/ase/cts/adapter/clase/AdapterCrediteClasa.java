package ro.ase.cts.adapter.clase;

public class AdapterCrediteClasa extends Leasing implements CreditAbstract {

    public AdapterCrediteClasa(String numeClient, float suma) {
        super(numeClient, suma);
    }

    @Override
    public void oferaCredit() {
        super.creeazaLeasing();
    }
}
