package task1;

import org.junit.Test;

import static task1.task1_1.Function.fn;
import static org.junit.Assert.*;

public class TestFunction {

    @Test
    public void testFn() {
        double d1 = 1.5693578060911904;
        double d2 = fn(1, 0);
        assertTrue("x=1, y=0, fn(x,y)=" + d2 + " instead " + d1, d1 == d2);
    }

}
