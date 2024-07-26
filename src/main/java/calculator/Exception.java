package calculator;

import java.util.*;
public class Exception {

    // errorType을 받는다.
    int errorType;

    // Exception class를 생성할 때 errorType을 매개변수로 받는다.
    public Exception(int errorType) {
        this.errorType = errorType;
    }
    public void errorNotice() {
        // num1 / num2의 나눗셈 과정에서 num2가 0이면 발생하는 에러 처리.
        if (this.errorType == 1) System.out.println("나누는 수가 0이므로 나누기를 수행할 수 없습니다.");
    }
}