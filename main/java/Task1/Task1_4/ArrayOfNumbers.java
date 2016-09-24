package Task1.Task1_4;

public class ArrayOfNumbers {

    int[] A;

    public ArrayOfNumbers(int N) {
        A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 101);
        }
    }

    public void findPrimeNumber() {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1) {
                continue;
            }
            boolean b = true;
            for (int d = 2; d * d <= A[i]; d++) {
                if (A[1] % d == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(A[i]);
            }
        }
    }
}
