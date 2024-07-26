package calculator;

public class ArithmeticCalculator extends Calculator {
    private double result;
    AddOperator addOperator;
    SubtractOperator subtractOperator;
    MultiplyOperator multiplyOperator;
    DivideOperator divideOperator;

    public ArithmeticCalculator () {
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }
    public double getResult() {
        return this.result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '+':
                this.result = addOperator.operate(num1, num2);
                break;
            case '-':
                this.result = subtractOperator.operate(num1, num2);
                break;
            case '*':
                this.result = multiplyOperator.operate(num1, num2);
                break;
            case '/':
                this.result = divideOperator.operate(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }

        this.results.add(this.result);
    }
}
