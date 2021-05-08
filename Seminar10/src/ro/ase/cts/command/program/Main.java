package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.*;

public class Main {
    public static void main(String[] args) {

        ManagerComenzi managerComenzi = new ManagerComenzi();
        ContBancar contBancar = new ContBancar("Rares");
        managerComenzi.invocaComanda(new ComandaConstituire(contBancar,50));
        managerComenzi.invocaComanda(new ComandaDepunere(contBancar,30));
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new ComandaRetragere(contBancar,40));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocaComanda(new ComandaRetragere(contBancar,50));
        managerComenzi.executaComanda();
    }
}
