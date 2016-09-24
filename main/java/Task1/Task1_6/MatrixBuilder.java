package Task1.Task1_6;

public class MatrixBuilder {

    public double[] A;
    public double[][] matrix;

    {
        int n = (int) (5 + Math.random() * 6);
        A = new double[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 10;
        }
        matrix = new double[n][n];
    }

    public void matrixFilling() {
        int n = 0;
        for (int i = 0; i < matrix.length; i++) {
            int m = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if (j + n < matrix.length) {
                    matrix[i][j] = A[j + n];
                } else {
                    matrix[i][j] = A[m];
                    m++;
                }
            }
            n++;
        }
    }

    public void showA() {
        System.out.print(A[0]);
        for (int i = 1; i < A.length; i++) {
            System.out.print(" " + A[i]);
        }
    }

    public void showMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][0]);
            for (int j = 1; j < matrix[0].length; j++) {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
}
