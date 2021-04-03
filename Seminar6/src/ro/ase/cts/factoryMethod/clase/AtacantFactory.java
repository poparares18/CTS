package ro.ase.cts.factoryMethod.clase;

public class AtacantFactory implements FabricaAbstracta {

    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Atacant(nume, meciuriJucate);
    }
}
