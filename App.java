package Work;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {//양의 정수 입력 받기
        int Number1 = 0;
        int Number2 = 0;
        char Operation = 'a';


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");

            int intNumber1 = sc.nextInt();
            if (intNumber1 > 0) {
                Number1 = intNumber1;
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char charOperation = sc.next().charAt(0);
            if (charOperation == '+' || charOperation == '-' || charOperation == '*' || charOperation == '/') {
                Operation = charOperation;
            }


            System.out.print("두 번째 숫자를 입력하세요: ");

            int intNumber2 = sc.nextInt();
            if (intNumber2 > 0) {
                Number2 = intNumber2;
            }


            if (Operation == '+') {
                System.out.println(Number1 + Number2);
            } else if (Operation == '-') {
                System.out.println(Number1 - Number2);
            } else if (Operation == '*') {
                System.out.println(Number1 * Number2);
            } else if (Operation == '/') {
                System.out.println(Number1 / Number2);
            }


        }
    }
}





