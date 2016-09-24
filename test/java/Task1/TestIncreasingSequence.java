package Task1;

import Task1.Task1_8.IncreasingSequence;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestIncreasingSequence {

    @Test
    public void testMasFirst() {
        IncreasingSequence mas = new IncreasingSequence();
        for (int i = 0; i < mas.masFirst.length - 1; i++) {
            assertTrue(mas.masFirst[i] <= mas.masFirst[i + 1]);
        }
    }

    @Test
    public void testMasSecond() {
        IncreasingSequence mas = new IncreasingSequence();
        for (int i = 0; i < mas.masSecond.length - 1; i++) {
            assertTrue(mas.masSecond[i] <= mas.masSecond[i + 1]);
        }
    }

    @Test
    public void testMasGeneral() {
        IncreasingSequence mas = new IncreasingSequence();
        mas.createGeneralMas();
        for (int i = 0; i < mas.masGeneral.length - 1; i++) {
            assertTrue(mas.masGeneral[i] <= mas.masGeneral[i + 1]);
        }
    }
}
