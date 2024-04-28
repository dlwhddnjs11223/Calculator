package Work;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {//양의 정수 입력 받기


        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");

            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            try {
                String stringNumber1 = sc.nextLine(); // String type으로 숫자를 입력받고
                double doubleNumber1 = Double.parseDouble(stringNumber1); // 입력받은 숫자를 double 타입으로 변환한다.
                if (doubleNumber1 < 0 || doubleNumber1 % 1 != 0) {  // 만약 double 타입으로 변환된 숫자가 0보다 작거나, 양수가 아닐 때
                    System.out.println("양의 정수만 입력해주세요");    // 양의 정수만 입력해달라는 알람을 띄운다.
                } else {                                            // 그 외의 경우에
                int inNumber1 = (int) doubleNumber1;}                // int number1이라는 변수에 int형으로 변한된 doubleNumber1 값을 저장한다.
            } catch (NumberFormatException e) {                     // 예외가 발생할 경우에
                System.out.println("양의 정수만 입력해주세요");        // 양의 정수만 입력해달라는 알람을 띄운다.
            }

            System.out.print("두 번째 숫자를 입력하세요: ");

            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            try {
                String stringNumber2 = sc.nextLine(); // String type으로 숫자를 입력받고
                double doubleNumber2 = Double.parseDouble(stringNumber2);
                if (doubleNumber2 < 0 || doubleNumber2 % 1 != 0) {
                    System.out.println("양의 정수만 입력해주세요");
                }
                int inNumber2 = (int) doubleNumber2;
            } catch (NumberFormatException e) {
                System.out.println("양의 정수만 입력해주세요");
            }


//                    System.out.println(intNumber1+" + "+intNumber2);
        }
    }
}





