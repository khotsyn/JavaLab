package task1.task1_8;

public class IncreasingSequence {

    public double[] masFirst;
    public double[] masSecond;
    public double[] masGeneral;

    {
        int n = (int) (1 + Math.random() * 5);
        masFirst = new double[n];
        masSecond = new double[n];
        masGeneral = new double[n + n];
        for (int i = 0; i < masFirst.length; i++) {
            masFirst[i] = Math.random() * 10;
            masSecond[i] = Math.random() * 10;
        }
        sortMethodShell(masFirst);
        sortMethodShell(masSecond);
    }

    private void sortMethodShell(double[] mas) {
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

    public  void createGeneralMas() {
        int f = 0, s = 0, g = 0;
        if (masFirst[f] <= masSecond[s]) {
            masGeneral[g] = masFirst[f];
            g++;
            f++;
        } else {
            masGeneral[g] = masSecond[s];
            g++;
            s++;
        }
        while (g < masGeneral.length) {
            if (f == masFirst.length) {
                masGeneral[g] = masSecond[s];
                g++;
                s++;
                continue;
            }
            if (s == masSecond.length) {
                masGeneral[g] = masFirst[f];
                g++;
                f++;
                continue;
            }
            if (masFirst[f] <= masSecond[s]) {
                masGeneral[g] = masFirst[f];
                g++;
                f++;
            } else {
                masGeneral[g] = masSecond[s];
                g++;
                s++;
            }
        }
    }

    public void showMasFirst() {
        for (int i = 0; i < masFirst.length; i++) {
            System.out.print(masFirst[i] + " ");
        }
        System.out.println();
    }

    public void showMasSecond() {
        for (int i = 0; i < masSecond.length; i++) {
            System.out.print(masSecond[i] + " ");
        }
        System.out.println();
    }

    public void showMasGeneral() {
        for (int i = 0; i < masGeneral.length; i++) {
            System.out.print(masGeneral[i] + " ");
        }
        System.out.println();
    }

}
