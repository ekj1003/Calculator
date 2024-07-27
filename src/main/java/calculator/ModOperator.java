package calculator;

public class ModOperator <T extends Number> implements Operator<T> {
    @Override
    public double operate(T n1, T n2) {
        return n1.intValue() % n2.intValue();
    }
}
