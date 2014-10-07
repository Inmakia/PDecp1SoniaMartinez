package operationCollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultiplicationTest extends OperationTest{

    private Multiplication mult;

    @Before
    public void before() {
        mult = new Multiplication(6, 2);
    }

    @Test
    public void testOperate() {
        assertEquals(12, mult.operate());
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, mult.getOperator1());
        assertEquals(2, mult.getOperator2());
    }

}
