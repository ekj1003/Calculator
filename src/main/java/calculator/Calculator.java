package calculator;

public class Calculator {

    double result;

    Exception exception;
    public double calcuate(int num1, int num2, char operator) {
        if (operator == '+') {
            this.result = num1 + num2;
        } else if (operator == '-') {
            this.result = num1 - num2;
        } else if (operator == '*') {
            this.result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                exception = new Exception(1);
                exception.exceptionNotice();
            }
            this.result = num1 / num2;
        }

        return this.result;

    }

}
