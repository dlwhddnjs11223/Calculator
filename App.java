package Work;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {//양의 정수 입력 받기




        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");

            int intNumber1 = sc.nextInt();

            double Number1 = intNumber1;


            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char charOperation = sc.next().charAt(0);

            char Operation = charOperation;


            System.out.print("두 번째 숫자를 입력하세요: ");

            int intNumber2 = sc.nextInt();

            double Number2 = intNumber2;


            double result = 0;
            if (Operation == '+') {
                result = Number1 + Number2;
            } else if (Operation == '-') {
                result = Number1 - Number2;
            } else if (Operation == '*') {
                result = Number1 * Number2;
            } else if (Operation == '/') {
                result = Number1 / Number2;
            }

            if(Operation == '/' && Number1 <= 0) {
                System.out.println("나눗셈 연산에서 분자(첫번째 정수)에 0이 입력될 수 없습니다.");
            } else if (Operation == '/' && Number2 <= 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                System.out.println("결과 : " + result);
            }
        }
    }
}





