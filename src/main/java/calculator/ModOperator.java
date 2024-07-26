package calculator;

public class ModOperator implements Operator{
    @Override
    public double operate(int n1, int n2) {
        return n1 % n2;
    }
}
