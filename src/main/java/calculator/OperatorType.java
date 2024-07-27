package calculator;

public enum OperatorType {
    ADD('+'),
    SUB('-'),
    MUL('*'),
    DIV('/'),
    MOD('%');

    private char operator;

    OperatorType(char op) {
        this.operator = op;
    }

    public char getOperator() {
        return this.operator;
    }

    public static OperatorType fromOperator(char op) {
        for (OperatorType type : OperatorType.values()) {
            if (type.getOperator() == op) {
                return type;
            }
        }
        throw new IllegalArgumentException("잘못된 연산자입니다.");
    }
}

