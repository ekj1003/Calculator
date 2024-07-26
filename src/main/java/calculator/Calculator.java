package calculator;

import java.util.List;

public class Calculator {
    private double result;

    public double getResult() {
        return this.result;
    }

    public void setResult(double res) {
        this.result = res;
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
    }

    public List<Double> removeResult(List<Double> array) {
        array.remove(0);
        return array;
    }

    public void inquiryResults(List<Double> array) {
        for (double element : array) {
            System.out.println(element);
        }
    }
}

