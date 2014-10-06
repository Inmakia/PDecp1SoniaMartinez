package operationCollection;


public class OperationHandler {
    private Operation[] operations = new Operation[10];

    public void add(Operation operator) {
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == null) {
                operations[i] = operator;

                return;
            }
        }
        return;
    }

    public void reset() {
        for (int i = 0; i < operations.length; i++) {
            operations[i] = null;
        }
    }

    // MAL DISEÑADO... MAL CODIFICADO
    public int total() {
        return 0;
    }

}
