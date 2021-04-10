package ro.ase.cts.decorator.clase;

public class DecoratorContactlessTelefon extends DecoratorAbstract {

    public DecoratorContactlessTelefon(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCardAbstract()).getTitular()+" a efectuat o plata contactless cu telefonul");
    }
}
