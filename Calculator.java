package Work;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //필드

    List<Double> results; // 캡슐화된 연산 결과를 저장하는 컬렉션 선언과 초기화를 동시에
    // 선언만 하고
    List<Double> Circleresults; // 계산된 원의 넓이를 저장, 생성자로 초기화, 외부에서 접근 불가,

    // Calculator 인스턴스를 생성(new)할 때 생성자를 통해 연산 결과를 저장하고 있는 컬렉션 필드가 초기화 되도록 수정합니다.

    // 생성자
    public Calculator(List<Double> results) {
        this.results = results; // 밑에서 초기화를 했다.
        this.Circleresults = results;
    }

    //메서드
//    public double calculate(double Num1, char Operation, double Num2) throws Exception {
//        double result = 0;
//
//        if (Operation == '+') { // operation 값이 +면
//            result = Num1 + Num2; // 다음 값을 result에 저장한다
//        } else if (Operation == '-') {  // 상동
//            result = Num1 - Num2;
//        } else if (Operation == '*') {
//            result = Num1 * Num2;
//        } else if (Operation == '/') {
//            if (Num1 < 1 && Num1%1!=0) {
//                throw new exception("정수값");
//            } else if (Num2 < 1 && Num2%1!=0) {
//                throw new exception("정수값");
//            } else {
//                result = Num1 / Num2;
//            }
//        } else {
//            throw new exception("사칙연산값");
//        }
//        System.out.println("결과 : " + result);
//        results.add(result);
//        return result;
//    }




    public List<Double> getResults() {
        return results;
    }

    public void removeResult() { // 이 메서드를 실행하면
        results.removeFirst(); // 해당 컬렉션의 첫번째 원소를 삭제한다.
    }

//    public double calculateCircleArea(double radius) throws Exception {
//        double circleArea = 0;
//        double PI = 3.14159265358979323846264338327950288419716939937510582097494459230781640628;
//
//       if (radius <= 0) {
//          throw new exception("양의 정수값");
//       }
//        circleArea = (radius * radius) + PI;
//        System.out.println("결과 : " + circleArea);
//        Circleresults.add(circleArea);
//        return circleArea;
//    }

    public List<Double> getCircleresults() {
        return Circleresults;
    }

    public void removeCircleresult() {
        Circleresults.removeFirst();
    }
}

class exception extends Exception {
    public exception(String type) {
        super(type + "를 확인해주세요");
    }

}