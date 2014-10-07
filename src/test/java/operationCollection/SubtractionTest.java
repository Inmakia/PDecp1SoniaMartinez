package operationCollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SubtractionTest extends OperationTest {

    private Subtraction res;
    
    @Before
    public void before() {
        res = new Subtraction(6, 2);
    }

    @Test
    public void testOperate() {
        assertEquals(4, res.operate());
    }

    @Test
    public void testSummation() {
        assertEquals(6, res.getOperator1());
        assertEquals(2, res.getOperator2());
    }

}
