package ro.ase.cts.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.dubluri.StudentDummy;
import ro.ase.cts.dubluri.StudentFake;
import ro.ase.cts.dubluri.StudentStub;
import ro.ase.cts.suite.categorii.TestePromovabilitateCategory;
import ro.ase.cts.suite.categorii.TesteUrgente;

import static org.junit.Assert.*;

public class TestPromovabilitateGrupaCuDubluri {

    @Test
    public void testReference() {
        Grupa grupa = new Grupa(1070);
        grupa.adaugaStudent(new StudentDummy());
        grupa.adaugaStudent(new StudentDummy());
        assertEquals(2, grupa.getStudenti().size());
    }

    @Test
    @Category(TestePromovabilitateCategory.class)
    public void testReferenceCuStub() {
        Grupa grupa=new Grupa(1063);
        grupa.adaugaStudent(new StudentStub());
        grupa.adaugaStudent(new StudentStub());
        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    @Category({TestePromovabilitateCategory.class, TesteUrgente.class})
    public void testReferenceCuFake() {
        Grupa grupa=new Grupa(1063);
        for(int i=0;i<7;i++) {
            StudentFake student=new StudentFake();
            student.setValoareAreRestanta(false);
            grupa.adaugaStudent(student);
        }
        for(int i=0;i<3;i++) {
            StudentFake student=new StudentFake();
            student.setValoareAreRestanta(true);
            grupa.adaugaStudent(student);
        }
        assertEquals(0.7, grupa.getPromovabilitate(), 0.01);
    }
}