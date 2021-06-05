package ro.ase.cts.teste;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;
import ro.ase.cts.suite.categorii.TestePromovabilitateCategory;

import static org.junit.Assert.*;

public class TestPromovabilitateGrupaWithFixture {

    private Grupa grupa;

    @Before
    public void setUp() {
        grupa = new Grupa(1085);
        for(int i=0;i<35;i++) {
            Student student = new Student("Rares");
            student.adaugaNota(7);
            student.adaugaNota(8);
            grupa.adaugaStudent(student);
        }
    }

    @Test(timeout = 500)
    @Category(TestePromovabilitateCategory.class)
    public void testPerformancePentruTimp() {
        grupa.getPromovabilitate();
    }

}