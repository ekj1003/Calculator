package calculator;

public class DivideOperator <T extends Number> implements Operator<T> {
    @Override
    public double operate(T n1, T n2) {
        if (n2.intValue() == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        } else {
            return n1.doubleValue() / n2.doubleValue();
        }
    }
}
