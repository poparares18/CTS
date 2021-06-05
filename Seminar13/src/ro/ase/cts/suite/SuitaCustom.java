package ro.ase.cts.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.suite.categorii.TestePromovabilitateCategory;
import ro.ase.cts.suite.categorii.TesteUrgente;
import ro.ase.cts.teste.GrupaTest;
import ro.ase.cts.teste.TestGetPromovabilitateGrupa;
import ro.ase.cts.teste.TestPromovabilitateGrupaCuDubluri;
import ro.ase.cts.teste.TestPromovabilitateGrupaWithFixture;

@RunWith(Categories.class)
@Suite.SuiteClasses({GrupaTest.class, TestGetPromovabilitateGrupa.class, TestPromovabilitateGrupaWithFixture.class, TestPromovabilitateGrupaCuDubluri.class})
//@Categories.IncludeCategory(TestePromovabilitateCategory.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {

}
