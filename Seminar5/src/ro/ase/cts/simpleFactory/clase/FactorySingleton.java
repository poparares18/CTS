package ro.ase.cts.simpleFactory.clase;

public class FactorySingleton {
    private static FactorySingleton factorySingleton = null;

    private FactorySingleton() {
    }

    public static synchronized FactorySingleton getInstance() {
        if(factorySingleton == null) {
            factorySingleton = new FactorySingleton();
        }
        return factorySingleton;
    }

    public Jucator getJucator(TipJucator tipJucator, String nume, int varsta) {
        switch (tipJucator) {
            case PORTAR:
                return new Portar(nume, varsta);
            case FUNDAS:
                return new Fundas(nume, varsta);
            case ATACANT:
                return new Atacant(nume, varsta);
            default:
                throw new IllegalArgumentException();
        }
    }
}
