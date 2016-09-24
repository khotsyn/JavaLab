package Task1.Task1_3;

public class Table{

    private double startNum;
    private double endNum;
    private double step;
    public double[][] table;

    public Table(double startNum, double endNum, double step) {
        this.startNum = startNum;
        this.endNum = endNum;
        this.step = step;
    }

    public void fillingTable() {
        if (endNum - startNum < step) {
            table = new double[1][2];
            table[0][0] = startNum;
            table[0][1] = DataCalculation.funTan(startNum);
        } else {
            double num = startNum;
            int amount = (int) ((endNum - startNum) / step + 1);
            table = new double[amount][2];
            for (int i = 0; i < amount; i++) {
                table[i][0] = num;
                table[i][1] = DataCalculation.funTan(num);
                num += step;
            }
        }
    }

    public void showTable() {
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + " " + table[i][1]);
        }
    }
}
