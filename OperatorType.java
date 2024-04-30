package Work;
public enum OperatorType {
    add('+'),
    sub('-'),
    mul('*'),
    div('/'),
    re('%');

    char operator;

    OperatorType(char operator) {
        this.operator = operator;
    }
    public char getOperator() {
        return operator;
    }
}