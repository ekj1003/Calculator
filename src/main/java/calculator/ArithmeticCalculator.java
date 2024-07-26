package calculator;

public class ArithmeticCalculator extends Calculator {
    private double result;

    public double getResult() {
        return this.result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                this.result = num1 + num2;
                break;
            case '-':
                this.result = num1 - num2;
                break;
            case '*':
                this.result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                } else {
                    this.result = (double) num1 / num2;
                }
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }

        this.results.add(this.result);
    }
}
