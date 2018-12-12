import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculusTest {

    @Test
    public void testConvertRadianoToGrau() {
        Calculus calculus = new Calculus();
        double expectedGrau = 180.0;
        assertEquals(calculus.convertRadianoToGrau(Math.PI), expectedGrau);
    }

    @Test
    public void testDistance() {
        Calculus calculus = new Calculus();
        double expectedMeter = 5.0;
        double meter = calculus.distance(6, 1, 2, 4);
        assertEquals(meter, expectedMeter);
    }

    @Test
    public void testRadiano() {
        Calculus calculus = new Calculus();
        double expectedQuadrant1 = 0;
        double expectedQuadrant2 = Math.PI / 2;
        double expectedQuadrant3 = Math.PI ;
        double expectedQuadrant4 = Math.PI*3/2 ;
        double radiano = calculus.radiano(0, 0, 1, 0);
        assertEquals(radiano, expectedQuadrant1);
        radiano = calculus.radiano(0, 1, 0, 0);
        assertEquals(radiano, expectedQuadrant2);
        radiano = calculus.radiano(1, 0, 0, 0);
        assertEquals(radiano, expectedQuadrant3);
        radiano = calculus.radiano(0, 0, 0, 1);
        assertEquals(radiano, expectedQuadrant4);
    }
    @Test
    public void testColisiomn() {
        Calculus calculus = new Calculus();
        boolean expectedNotColision = false;
        boolean expectedConfirmColision = true;
        boolean notColision = calculus.isColision(10,10,200,200);
        boolean confirmColision = calculus.isColision(10,10,20,100);
        assertEquals(notColision, expectedNotColision);
        assertEquals(confirmColision, expectedConfirmColision);
    }

}

