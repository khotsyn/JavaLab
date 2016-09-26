package task1.task1_7;

public class ShellSort {

    public double[] mas;

    {
        int n = (int) (10 + Math.random() * 16);
        mas = new double[n];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.random() * 10;
        }
    }

    public void sortMethodShell() {
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] > mas[i + 1]) {
                double m = mas[i];
                mas[i] = mas[i + 1];
                mas[i + 1] = m;
                if (i != 0) {
                    i -= 2;
                }
            }
        }
    }

    public void showMas() {
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }

}
