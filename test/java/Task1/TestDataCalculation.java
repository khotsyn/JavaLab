package Task1;

import org.junit.Test;
import static Task1.Task1_3.DataCalculation.*;
import static org.junit.Assert.*;

public class TestDataCalculation {

    @Test
    public void testFunTan1() {
        assertEquals(0.0, funTan(0), 0.00000001);
    }

    @Test
    public void testFunTan2() {
        double pi = Math.PI;
        assertEquals(0.0, funTan(pi), 0.00000001);
    }
}
