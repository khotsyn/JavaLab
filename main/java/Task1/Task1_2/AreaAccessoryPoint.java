package Task1.Task1_2;


public class AreaAccessoryPoint {

    public static boolean accessoryToArea(double x, double y) {
        boolean b;
        if (x > 4 && y > 5) {
            b = false;
        } else if (x < -4 && y > 5) {
            b = false;
        } else if (x < -6 && y < -3) {
            b = false;
        } else if (x > 6 && y < -3) {
            b = false;
        } else {
            b = true;
        }
        return b;
    }

    public static void isPoint(double x, double y) {
        boolean bl = accessoryToArea(x, y);
        if (bl) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
