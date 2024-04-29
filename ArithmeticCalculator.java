package Work;

import java.util.List;

public class ArithmeticCalculator extends Calculator {


    public ArithmeticCalculator(List<Double> results) {
        super(results);
        // 부모 클래스에 초기화가 필요한 컬렉션이 있어서 매개변수가 있는 생성자를 만들어줘야 하는듯? 맞는지 확인 필요

    }

    public double arithmeticCaculator(double Num1, char Operator, double Num2) throws exception {
        double result = 0;
        if (Operator == '+') { // operation 값이 +면
            result = Num1 + Num2; // 다음 값을 result에 저장한다
        } else if (Operator == '-') {  // 상동
            result = Num1 - Num2;
        } else if (Operator == '*') {
            result = Num1 * Num2;
        } else if (Operator == '/') {
            if (Num1 < 1 || Num1 % 1 != 0) {
                throw new exception("양의 정수값을 입력했는지");
            } else if (Num2 < 1 && Num2 % 1 != 0) {
                throw new exception("양의 정수값을 입력했는지");
            } else {
                result = Num1 / Num2;
            }
        } else {
            throw new exception("사칙연산값을 입력했는지");
        }
        System.out.println("결과 : " + result);
        results.add(result);
        return result;
    }

}

