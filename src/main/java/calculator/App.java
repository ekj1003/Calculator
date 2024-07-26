package calculator;

import java.util.*;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> resArr = new ArrayList<>();


        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /

            char operator = sc.next().charAt(0);

            int result = 0;
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                result = num1 / num2;
            }


            resArr.add(result);


            System.out.println("결과: " + result);
            // 버퍼 비우기
            sc.nextLine();
            // nextInt()가 숫자를 입력 받은 후
            // 개행 문자를 버퍼에 남겨 exit과 비교하므로
            // 버퍼를 비워주어야 한다.

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeFlag = sc.nextLine();
            if(removeFlag.equals("remove")) {
                resArr.remove(0);
            }
            sc.nextLine();

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquiryFlag = sc.nextLine();
            if(inquiryFlag.equals("inquire")) {
                for(int element: resArr) {
                    System.out.println(element);
                }
            }
            sc.nextLine();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String flagExit = sc.nextLine();
            if (flagExit.equals("exit")) break;

        }

    }
}