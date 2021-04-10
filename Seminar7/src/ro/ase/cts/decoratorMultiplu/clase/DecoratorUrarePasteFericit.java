package ro.ase.cts.decoratorMultiplu.clase;

public class DecoratorUrarePasteFericit extends DecoratorAbstract {

    public DecoratorUrarePasteFericit(OperatorBiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void rezervaBilet() {
        super.rezervaBilet();
        System.out.println("Paste fericit si hai la meci!");
    }
}
