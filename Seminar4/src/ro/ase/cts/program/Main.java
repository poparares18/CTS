package ro.ase.cts.program;

import ro.ase.cts.singleton.AsigurareMedicala;

public class Main {
    public static void main(String[] args) {
        AsigurareMedicala asigurareMedicala1 = AsigurareMedicala.getInstance();
        AsigurareMedicala asigurareMedicala2 = AsigurareMedicala.getInstance();

        asigurareMedicala1.setId(2);
        asigurareMedicala2.setContributie(350.5f);

        System.out.println(asigurareMedicala1.toString());
        System.out.println(asigurareMedicala2.toString());

        ro.ase.cts.singletonLazy.AsigurareMedicala asigurareMedicalaLazy1 = ro.ase.cts.singletonLazy.AsigurareMedicala.getInstance(100, "Andrei", 300.0f);
        ro.ase.cts.singletonLazy.AsigurareMedicala asigurareMedicalaLazy2 = ro.ase.cts.singletonLazy.AsigurareMedicala.getInstance(101, "Radu", 350.8f);
        System.out.println(asigurareMedicalaLazy1);
        System.out.println(asigurareMedicalaLazy2);
    }
}
