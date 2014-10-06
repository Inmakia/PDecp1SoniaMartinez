package operationCollection;

public class Subtraction extends Operation{

    public Subtraction(int operator1, int operator2) {
        super(operator1, operator2);
    }

    @Override
    public int operate() {
        return getOperator1() - getOperator2();
    }

}
