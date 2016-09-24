package Task1;

import Task1.Task1_6.MatrixBuilder;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMatrixBuilder {

    //public static final int k = 4;

    @Test
    public void testMatrixFilling() {
        MatrixBuilder mat = new MatrixBuilder();
        mat.matrixFilling();
        // k - index (number) of array A for comparison
        // p - index of line in matrix
        int k = (int) (Math.random() * mat.matrix.length);
        int p = (int) (Math.random() * mat.matrix.length);
        if (p <= k) {
            System.out.println(1);
            assertEquals(mat.A[k], mat.matrix[p][k-p], 0.0000001);
        } else {
            System.out.println(2);
            assertEquals(mat.A[k], mat.matrix[p][mat.matrix.length - (p - k)], 0.0000001);
        }
    }
}
