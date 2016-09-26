package task1;

import task1.task1_7.ShellSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestShellSort {

    @Test
    public void testSortMethodShell() {
        ShellSort shellSort = new ShellSort();
        shellSort.sortMethodShell();
        for (int i = 0; i < shellSort.mas.length - 1; i++) {
            assertTrue(shellSort.mas[i] <= shellSort.mas[i + 1]);
        }
    }
}
