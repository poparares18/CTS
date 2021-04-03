package ro.ase.cts.factoryMethod.clase;

public class FundasFactory implements FabricaAbstracta {

    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Fundas(nume, meciuriJucate);
    }
}
