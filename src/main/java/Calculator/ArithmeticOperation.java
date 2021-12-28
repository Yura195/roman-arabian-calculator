package Calculator;

public enum ArithmeticOperation {
    OPERATION("[-+*/]");

    String operation;

    ArithmeticOperation(String s) {
        this.operation = s;
    }

    String getOperation() {
        return this.operation;
    }
}
