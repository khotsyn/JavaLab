package task1;

import org.junit.Test;
import static org.junit.Assert.*;
import static task1.task1_2.AreaAccessoryPoint.*;

public class TestAreaAccessoryPoint {

    @Test
    public void testAccessoryToArea1T() {
        assertEquals(true, accessoryToArea(2, 1));
    }

    @Test
    public void testAccessoryToArea1F() {
        assertEquals(true, accessoryToArea(2, 6));
    }

    @Test
    public void testAccessoryToArea2T() {
        assertEquals(true, accessoryToArea(-2, 1));
    }

    @Test
    public void testAccessoryToArea2F() {
        assertEquals(true, accessoryToArea(-2, 6));
    }

    @Test
    public void testAccessoryToArea3T() {
        assertEquals(true, accessoryToArea(-2, -2));
    }

    @Test
    public void testAccessoryToArea3F() {
        assertEquals(true, accessoryToArea(-8, -2));
    }

    @Test
    public void testAccessoryToArea4T() {
        assertEquals(true, accessoryToArea(2, -2));
    }

    @Test
    public void testAccessoryToArea4F() {
        assertEquals(true, accessoryToArea(8, -2));
    }

}
