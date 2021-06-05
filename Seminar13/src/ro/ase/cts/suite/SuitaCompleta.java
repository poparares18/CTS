package ro.ase.cts.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.teste.GrupaTest;
import ro.ase.cts.teste.TestGetPromovabilitateGrupa;
import ro.ase.cts.teste.TestPromovabilitateGrupaCuDubluri;
import ro.ase.cts.teste.TestPromovabilitateGrupaWithFixture;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestGetPromovabilitateGrupa.class, TestPromovabilitateGrupaCuDubluri.class, TestPromovabilitateGrupaWithFixture.class})
public class SuitaCompleta {

}
