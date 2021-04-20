package ro.ase.cts.proxy.clase;

public class OperatorRezervare implements OperatorRezervari {
    private String numeRestaurant;

    public OperatorRezervare(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
    }

    @Override
    public void rezerva(int numarPersoane) {
        System.out.println("A fost realizata rezervarea la "+ numeRestaurant + " pentru un numar de " + numarPersoane + " persoane!");
    }
}
