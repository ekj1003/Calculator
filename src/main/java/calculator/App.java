package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator<Number> arithmeticCalculator = new ArithmeticCalculator<>();
        CircleCalculator circleCalculator = new CircleCalculator();
        Scanner sc = new Scanner(System.in);
        int menu;

        while (true) {
            System.out.println("메뉴를 선택하세요(1: 원넓이 계산, 2:사칙연산).");
            menu = sc.nextInt();
            sc.nextLine(); // 개행문자 제거

            if (menu == 1) {
                System.out.print("반지름을 입력하세요: ");
                double r = sc.nextDouble();
                sc.nextLine(); // 개행문자 제거
                circleCalculator.calculateCircleArea(r);

                System.out.println("결과: " + circleCalculator.getCircleArea());

                System.out.print("원 넓이 결과를 조회하시겠습니까? (inquire 입력 시 조회): ");
                String inquiryFlag = sc.nextLine();
                if (inquiryFlag.equals("inquire")) {
                    circleCalculator.inquiryAreaResults();
                }

                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
                String flagExit = sc.nextLine();
                if (flagExit.equals("exit")) break;
            } else if (menu == 2) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double num1 = sc.nextDouble();
                sc.nextLine(); // 개행문자 제거

                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = sc.nextDouble();
                sc.nextLine(); // 개행문자 제거

                System.out.print("사칙연산 기호를 입력하세요: "); // +, -, *, /
                char operator = sc.next().charAt(0);
                sc.nextLine(); // 개행문자 제거

                arithmeticCalculator.calculate(num1, num2, operator);

                System.out.println("결과: " + arithmeticCalculator.getResult());

                System.out.print("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
                String removeFlag = sc.nextLine();
                if (removeFlag.equals("remove") && !arithmeticCalculator.getResults().isEmpty()) {
                    arithmeticCalculator.removeResult();
                }

                System.out.print("저장된 연산결과를 조회하시겠습니까? (inquire 입력 시 조회): ");
                String inquiryFlag = sc.nextLine();
                if (inquiryFlag.equals("inquire")) {
                    arithmeticCalculator.inquiryResults();
                }

                System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
                String flagExit = sc.nextLine();
                if (flagExit.equals("exit")) break;
            }
        }
        sc.close();
    }
}
