package operationCollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SummationTest extends OperationTest {

    private Summation sum;

    @Before
    public void before() {
        sum = new Summation(6, 2);
    }

    @Test
    public void testOperate() {
        assertEquals(8, sum.operate());
    }

    @Test
    public void testSummation() {
        assertEquals(6, sum.getOperator1());
        assertEquals(2, sum.getOperator2());
    }

}
