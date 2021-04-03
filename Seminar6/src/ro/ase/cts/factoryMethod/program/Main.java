package ro.ase.cts.factoryMethod.program;

import ro.ase.cts.factoryMethod.clase.*;

public class Main {

    private static void afisareInformatiiJucator(FabricaAbstracta fabricaAbstracta, String nume, int meciuriJucate) {
       Jucator jucator = fabricaAbstracta.getJucator(nume, meciuriJucate);
       System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afisareInformatiiJucator(new AtacantFactory(), "Rares", 10);
        afisareInformatiiJucator(new PortarFactory(), "Bogdan", 20);
        afisareInformatiiJucator(new FundasFactory(), "Andrei", 30);
        afisareInformatiiJucator(new MijlocasFactory(), "Alexandru", 40);
    }
}
