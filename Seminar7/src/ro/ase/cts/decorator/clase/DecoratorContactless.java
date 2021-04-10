package ro.ase.cts.decorator.clase;

public class DecoratorContactless extends DecoratorAbstract {

    public DecoratorContactless(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCardAbstract()).getTitular()+" a efectuat o plata contactless");
    }
}
