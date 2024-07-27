package calculator;

public class AddOperator <T extends Number> implements Operator<T>{
    @Override
    public double operate(T n1, T n2) {
        return n1.doubleValue() + n2.doubleValue();
    }
}
