package Work;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<Double> results = new ArrayList<>(); // 연산 결과를 저장하는 컬렉션

    public double calculate(double Num1, char Operation, double Num2) throws Exception {
        double result = 0;

        if (Operation == '+') { // operation 값이 +면
            result = Num1 + Num2; // 다음 값을 result에 저장한다
        } else if (Operation == '-') {  // 상동
            result = Num1 - Num2;
        } else if (Operation == '*') {
            result = Num1 * Num2;
        } else if (Operation == '/') {
            if(Num1 < 1 ) {
               throw new exception("정수값");
            } else if (Num2 <1) {
                throw new exception("정수값");
            } else{
                result = Num1 / Num2;
            }
        } else {
            throw new exception("사칙연산값");
        }
        System.out.println("결과 : " + result);
        results.add(result);
            return result;


    }
}

class exception extends Exception {
    public exception(String type) {
        super(type+"을 확인해주세요");
    }

}