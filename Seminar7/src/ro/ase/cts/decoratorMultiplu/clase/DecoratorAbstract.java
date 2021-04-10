package ro.ase.cts.decoratorMultiplu.clase;

public class DecoratorAbstract implements OperatorBiletAbstract {

    private OperatorBiletAbstract bilet;

    public DecoratorAbstract(OperatorBiletAbstract bilet) {
        this.bilet = bilet;
    }

    @Override
    public void rezervaBilet() {
        bilet.rezervaBilet();
    }

    @Override
    public String getNumeEchipaGazda() {
        return bilet.getNumeEchipaGazda();
    }

    @Override
    public String getNumeEchipaOaspeti() {
        return bilet.getNumeEchipaOaspeti();
    }
}
