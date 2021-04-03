package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(1, false, true, true, false, "Clasica");
        System.out.println(rezervare);

        //rezervare prin intermediul builder-ului
        Rezervare rezervare1 = new RezervareBuilder().setCod(10).setBauturaRacoritoare(true).setMuzicaAmbientala(true).build();
        System.out.println(rezervare1.toString());
        Rezervare rezervare2 = new RezervareBuilder().setCod(11).setScaunErgonomic(true).build();
        Rezervare rezervare3 = new RezervareBuilder(12).setGenMuzica("pop").build();
        System.out.println(rezervare2);
        System.out.println(rezervare3);

        //shallow copy
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare r1;
        Rezervare r2;
        r1 = builder.setCod(13).setGenMuzica("jazz").build();
        r2 = builder.setCod(14).build();
        System.out.println(r1);
        System.out.println(r2);

        //nu mai facem shallow copy
        RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2().setMancareInclusa(true).setBauturaRacoritoare(true);
        Rezervare rezervare4 = builder.setCod(13).build();
        Rezervare rezervare5 = builder.setCod(14).build();
        System.out.println(rezervare4.toString());
        System.out.println(rezervare5.toString());
    }
}
