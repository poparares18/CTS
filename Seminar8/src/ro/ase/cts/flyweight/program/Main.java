package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {
    public static void main(String[] args) {

        Rezervare rezervare1 = new Rezervare(100, 3, 19);
        Rezervare rezervare2 = new Rezervare(101, 2, 20);
        Rezervare rezervare3 = new Rezervare(102, 4, 22);

        FabricaClienti fabrica = new FabricaClienti();

        Client client1 = fabrica.getClient("anonim@yahoo.com");
        client1.printeazaInformatiiRezervare(rezervare1);
        fabrica.getClient("client2@test.com").printeazaInformatiiRezervare(rezervare2);

        fabrica.getClient("anonim@yahoo.com").printeazaInformatiiRezervare(rezervare3);
    }
}
