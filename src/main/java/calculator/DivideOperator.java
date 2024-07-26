package calculator;

public class DivideOperator implements Operator {
    @Override
    public double operate(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        } else {
            return (double) n1 / n2;
        }
    }
}
