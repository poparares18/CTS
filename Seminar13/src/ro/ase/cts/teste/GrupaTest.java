package ro.ase.cts.teste;

import org.junit.Test;
import ro.ase.cts.clase.Grupa;

import static org.junit.Assert.*;

public class GrupaTest {

    @Test
    public void testRight() {
        Grupa grupa=new Grupa(1085);

        assertEquals(1085,grupa.getNrGrupa());
    }

    @Test
    public void testBoundaryLimitaInferioara() {
        Grupa grupa=new Grupa(1000);
        assertEquals(1000, grupa.getNrGrupa());
    }

    @Test
    public void testBoundaryLimitaSuperioara() {
        Grupa grupa=new Grupa(1100);
        assertEquals(1100, grupa.getNrGrupa());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testErrorLimitaInferioara() {
        Grupa grupa = new Grupa(700);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testErrorLimitaSuperioara() {
        Grupa grupa = new Grupa(1700);
    }

    @Test(timeout = 500)
    public void testPerformanta() {
        Grupa grupa=new Grupa(1085);
    }

    @Test
    public void testExistence() {
        Grupa grupa=new Grupa(1085);

        assertNotNull(grupa.getNrGrupa());
    }


}