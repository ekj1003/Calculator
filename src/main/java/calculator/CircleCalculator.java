package calculator;

public class CircleCalculator extends Calculator {
    private double circleArea;
    static final double PI = 3.141592; // 원 넓이를 구할 때 PI 값은 상수이므로 static final 사용

    public double getCircleArea() {
        return this.circleArea;
    }

    public void setCircleArea(double circleArea) {
        this.circleArea = circleArea;
    }

    public void calculateCircleArea(double radius) {
        circleArea = Math.pow(radius, 2) * PI;
        areaResults.add(circleArea);
    }
}
