package calculator;

import java.util.*;

public class Calculator {
    // < 변수 >
    private double result = 0.0;
    private List<Double> results;
    private double circleArea;
    private List<Double> areaResults;
    static final double PI = 3.141592; // 원 넓이를 구할 때 PI 값은 상수이므로 static final 사용



    // < 생성자 >
    // 생성자를 통해 results 초기화
    public Calculator() {
        this.results = new ArrayList<>();
        this.areaResults = new ArrayList<>();
    }


    // < Getter, Setter >
    public double getResult() { return this.result; }
    public void setResult(double res) {
        this.result = res;
    }
    public List<Double> getResults() {
        return results;
    }
    public void setResults(List<Double> res) { this.results = res; }
    public double getCircleArea() { return this.circleArea; }
    public void setCircleArea(double area) { this.circleArea = area; }
    public List<Double> getAreaResults() { return this.areaResults; }




    // < 기능 메서드 >
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

    public void calculateCircleArea(double radius) {
        circleArea = Math.pow(radius, 2) * PI;
        areaResults.add(circleArea);
    }

    public void inquiryAreaResults() {
        for (double element : areaResults) {
            System.out.println(element);
        }
    }
}

