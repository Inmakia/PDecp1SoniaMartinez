package operationCollection;

public class OperationHandler {
    final int SIZE = 10;

    private Operation[] operations = new Operation[this.SIZE];

    public void add(Operation operator) {
        int i = 0;
        while (i < operations.length && operations[i] != null) {
            i++;
        }
        operations[i] = operator;
    }

    public void reset() {
        this.operations = new Operation[this.SIZE];
    }

    public int total() {
        int total = 0;
        for (Operation operation : this.operations) {
            if (operation != null) {
                total = total + operation.operate();
            }
        }
        return total;
    }

}
