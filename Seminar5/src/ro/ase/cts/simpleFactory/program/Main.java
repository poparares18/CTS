package ro.ase.cts.simpleFactory.program;

import ro.ase.cts.simpleFactory.clase.Factory;
import ro.ase.cts.simpleFactory.clase.FactorySingleton;
import ro.ase.cts.simpleFactory.clase.Jucator;
import ro.ase.cts.simpleFactory.clase.TipJucator;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Jucator portar = factory.getJucator(TipJucator.PORTAR, "Rares1", 29);
        Jucator fundas = factory.getJucator(TipJucator.FUNDAS, "Rares2", 26);

        System.out.println(portar.toString());
        System.out.println(fundas.toString());

        //Factory cu singleton
        FactorySingleton factorySingleton = FactorySingleton.getInstance();
        Jucator portar2 = factorySingleton.getJucator(TipJucator.PORTAR, "Rares3", 29);
        Jucator fundas2 = factorySingleton.getJucator(TipJucator.FUNDAS, "Rares4", 26);

        System.out.println(portar2.toString());
        System.out.println(fundas2.toString());
    }
}
