package Task1;

import Task1.Task1_9.BallColour;
import Task1.Task1_9.Basket;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBasket {

    @Test
    public void testFillingBasket() {
        Basket basket = new Basket();
        basket.fillingBasket();
        for (int i = 0; i < basket.bsk.length - 1; i++) {
            assertNotNull(basket.bsk[i]);
        }
    }

    @Test
    public void testWeightBallsInBasket() {
        Basket basket = new Basket();
        basket.fillingBasket();
        int weightBasket1 = basket.weightBallsInBasket();
        basket.bsk[0].weight += 5;
        assertEquals(weightBasket1 + 5, basket.weightBallsInBasket());
    }

    @Test
    public void testAmountColourBalls() {
        Basket basket = new Basket();
        basket.fillingBasket();
        for (int i = 0; i < basket.bsk.length; i++) {
            basket.bsk[i].colour = BallColour.BLUE;
        }
        assertEquals(basket.bsk.length, basket.amountColourBalls(BallColour.BLUE));
    }

}
