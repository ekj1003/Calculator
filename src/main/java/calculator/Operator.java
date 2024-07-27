package calculator;

public interface Operator <T extends Number> {
    double operate(T n1, T n2);
}
