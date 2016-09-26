package task1;

import org.junit.Test;
import task1.task1_3.Table;
import static org.junit.Assert.*;

public class TestTable {

    @Test
    public void testTable1() {
        Table tbl = new Table(0, Math.PI/2, 10.1);
        tbl.fillingTable();
        assertEquals(0, tbl.table[0][0], 0.0001);
    }

    @Test
    public void testTable2() {
        Table tbl = new Table(0, Math.PI/2, 10.1);
        tbl.fillingTable();
        assertEquals(0, tbl.table[0][1], 0.0001);
    }

    @Test
    public void testTable3() {
        Table tbl = new Table(0, 10.1, Math.PI/2);
        tbl.fillingTable();
        System.out.println(Math.PI/2);
        System.out.println(tbl.table[1][0]);
        assertEquals(Math.PI/2, tbl.table[1][0], 0.0001);
    }
}
