package Work;

import java.util.*;

public class App {
    public static void main(String[] args) {//양의 정수 입력 받기

        double[] results = new double[10]; // 연산의 결과를 저장할 배열
        int i = 0; // count


        Scanner sc = new Scanner(System.in);
        while (true) { // 반복문을 사용해서 연산을 반복


            System.out.print("첫 번째 숫자를 입력하세요: "); // 출력

            int intNumber1 = sc.nextInt();  // 입력한 값을 int타입의 intNumber1에 저장한다.

            double Number1 = intNumber1;    // Number1에 intNumber1을 저장한다.


            System.out.print("사칙연산 기호를 입력하세요: "); // 출력
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char charOperation = sc.next().charAt(0);   // 입력된 값을 char 타입의 charOperation에 저장

            char Operation = charOperation; // Operation에 operation을 저장


            System.out.print("두 번째 숫자를 입력하세요: "); // 출력

            int intNumber2 = sc.nextInt();  // 입력된 값을 int 타입의 intNumber2에 저장

            double Number2 = intNumber2;    // Number2에 intNumber2을 저장


            double result = 0;
            if (Operation == '+') { // operation 값이 +면
                result = Number1 + Number2; // 다음 값을 result에 저장한다
            } else if (Operation == '-') {  // 상동
                result = Number1 - Number2;
            } else if (Operation == '*') {
                result = Number1 * Number2;
            } else if (Operation == '/') {
                result = Number1 / Number2;
            }

            if (Operation == '/' && Number1 < 1) {  // operation 값이 '/'이면서 Number1이 1 이하면
                System.out.println("나눗셈 연산에서 분자(첫번째 정수)에 0이 입력될 수 없습니다."); // 출력
            } else if (Operation == '/' && Number2 < 1) {    // operation 값이 '/'이면서 Number2이 1 이하면
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다."); // 출력
            } else {
                System.out.println("결과 : " + result);  // 그 외의 경우에 result 값을 출력
                if (i > 9) { // 배열의 원소갯수가 10개를 초과하면
                   for (int k = 1; k < 9; k++) { // 아래 구문을 반복한다.

                       results[k] = results[k-1];   // 배열을 하나씩 앞으로 당긴다.

                   }
                   results[9] = result; // 빠져나와서 9번쨰 원소에 result값을 넣는다.
                    System.out.println(Arrays.toString(results)); // 배열의 원소값
                }
                    results[i] = result; // results 배열에 result 값을 저장한다.
                i = i+1;    // 인덱스 값을 증가시킨다.

                 System.out.println(i); // 인덱스값
                System.out.println(Arrays.toString(results)); // 배열의 원소값
                System.out.println(results.length); // 배열의 원소갯수값

            }


            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)"); // 출력
            String exit = sc.next(); // exit에 입력값을 저장하고
            if (exit.equals("exit")) { // exit값이 "exit"와 동일하면
                break;  // 반복을 종료한다.
            }


        }
    }
}





