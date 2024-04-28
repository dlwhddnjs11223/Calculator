package Work;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {//양의 정수 입력 받기
int Number1;
int Number2;
char Operation;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");

            int intNumber1 = sc.nextInt();
            if (intNumber1 < 0) {
                System.out.println("양의 정수만 입력해주세요");
            } else {
                Number1 = intNumber1;
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            Operation = sc.next().charAt(0);


            System.out.print("두 번째 숫자를 입력하세요: ");

            int intNumber2 = sc.nextInt();
            if (intNumber2 < 0) {
                System.out.println("양의 정수만 입력해주세요");
            } else {
                Number2 = intNumber2;
            }

            System.out.println(Number1+Number2);
        }
    }
}





