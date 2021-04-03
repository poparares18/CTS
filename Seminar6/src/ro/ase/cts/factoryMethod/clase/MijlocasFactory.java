package ro.ase.cts.factoryMethod.clase;

public class MijlocasFactory implements FabricaAbstracta {

    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Mijlocas(nume, meciuriJucate);
    }
}
