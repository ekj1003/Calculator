package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private double result = 0.0;
    private List<Double> results;

    // 생성자를 통해 results 초기화
    public Calculator() {
        this.results = new ArrayList<>();
    }
    public double getResult() {
        return this.result;
    }

    public void setResult(double res) {
        this.result = res;
    }

    public List<Double> getResults() {
        return results;
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

    public void removeResult() {
        this.results.remove(0);
    }

    public void inquiryResults() {
        for (double element : this.results) {
            System.out.println(element);
        }
    }
}

