package calculator;

public class Calculator {

    public double calculate(int num1, int num2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                } else {
                    result = (double) num1 / num2;
                }
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
        return result;
    }
}

