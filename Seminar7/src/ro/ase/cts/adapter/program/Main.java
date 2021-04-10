package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterCrediteClasa;
import ro.ase.cts.adapter.clase.AdapterLeasingToCredit;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Main {

    public static void creazaCredit(CreditAbstract credit) {
        credit.oferaCredit();
    }

    public static void main(String[] args) {

        Leasing leasing = new Leasing("Rares", 1500);
        AdapterLeasingToCredit adapter = new AdapterLeasingToCredit(leasing);
        creazaCredit(adapter);

        AdapterCrediteClasa adapterCrediteClasa = new AdapterCrediteClasa("Bogdan", 2000);
        creazaCredit(adapterCrediteClasa);

    }
}
