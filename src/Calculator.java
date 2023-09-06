import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("간단한 계산기입니다.");
        System.out.print("첫번째 숫자 입력 : ");
        num1 = sc.nextInt();

        System.out.print("연산자를 입력하세요 (+, -, *, /): ");
        operator = sc.next().charAt(0);

        System.out.print("두번째 숫자 입력 : ");
        num2 = sc.nextInt();

        double result;

        switch(operator){
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
            case '*':
                result = num1 * num2;
            case '/':
                if (num2 != 0){
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌수 없습니다.");
                    return;
                }
                break;
            default:
                System.out.println("올바른 연산자 입력하시오.");
                return;
        }

        System.out.println("결과: " + num1 + "" + operator + "" + num2 + " = " + result);
    }
}
