package task1.task1_9;

public class MainDemo {
    public static void main(String[] args) {
        Basket bas = new Basket();
        bas.fillingBasket();
        bas.showColourBalls();
        System.out.println(bas.weightBallsInBasket());
        System.out.println(bas.amountColourBalls(BallColour.BLUE));
    }
}
