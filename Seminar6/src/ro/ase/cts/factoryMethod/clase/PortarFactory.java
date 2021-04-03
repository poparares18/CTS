package ro.ase.cts.factoryMethod.clase;

public class PortarFactory implements FabricaAbstracta {

    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Portar(nume, meciuriJucate);
    }
}
