package task1.task1_3;


public class DataCalculation {

    public static double funTan(double num) {
        try {
            return Math.tan(num);
        } catch (ArithmeticException e) {
            return 0;
        }
    }

}
