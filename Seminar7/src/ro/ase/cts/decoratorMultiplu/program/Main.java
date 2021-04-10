package ro.ase.cts.decoratorMultiplu.program;

import ro.ase.cts.decoratorMultiplu.clase.Bilet;
import ro.ase.cts.decoratorMultiplu.clase.DecoratorAbstract;
import ro.ase.cts.decoratorMultiplu.clase.DecoratorSustinereEchipa;
import ro.ase.cts.decoratorMultiplu.clase.DecoratorUrarePasteFericit;

public class Main {
    public static void main(String[] args) {

        Bilet bilet = new Bilet("Steaua","Rapid");
        bilet.rezervaBilet();

        DecoratorAbstract meciInGhencea=new DecoratorSustinereEchipa(bilet);
        meciInGhencea.rezervaBilet();

        DecoratorAbstract meciDePaste=new DecoratorUrarePasteFericit(bilet);
        meciDePaste.rezervaBilet();

        DecoratorAbstract meciInGhenceaDePaste = new DecoratorSustinereEchipa(meciDePaste);
        System.out.println();
        meciInGhenceaDePaste.rezervaBilet();
    }
}
