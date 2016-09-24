package Task1;

import Task1.Task1_9.Ball;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBall {

    @Test
    public void testBallColour() {
        Ball ball = new Ball(3);
        assertNotNull(ball.colour);
    }

    @Test
    public void testBallWeight() {
        int w = 3;
        Ball ball = new Ball(w);
        assertEquals(w, ball.weight);
    }
}
