package operationCollection;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class OperationHandlerTest {

    private OperationHandler operations;

    @Before
    public void before() {
        operations = new OperationHandler();
        operations.add(new Subtraction(1, 1));
        operations.add(new Summation(3, 5));
        operations.add(new Subtraction(4, 1));
        operations.add(new Summation(3, 6));
        operations.add(new Subtraction(3, 2));
        operations.add(new Multiplication(2, 3));

    }

    @Test
    public void testReset() {
        operations.reset();
        assertEquals(0, operations.total());
    }

    @Test
    public void testTotal() {
        assertEquals(27, operations.total());
    }

}
