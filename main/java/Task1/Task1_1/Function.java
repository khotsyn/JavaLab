package task1.task1_1;


public class Function {
    public static double fn(double x, double y) {
        double num, denom, f;
        num = 1 + Math.pow(Math.sin(x + y), 2);
        denom = 2 + Math.abs(x - 2 * x / (1 + x * x * y * y));
        f = num / denom + x;
        return f;
    }
}
