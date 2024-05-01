package Work;

import java.util.List;
import java.util.Scanner;

public class ArithmeticCalculator extends Calculator {

    char add = OperatorType.add.getOperator();
    char sub = OperatorType.sub.getOperator();
    char mul = OperatorType.mul.getOperator();
    char div = OperatorType.div.getOperator();
    char re = OperatorType.re.getOperator();

    public ArithmeticCalculator(List<Double> results) { // 필드 초기화
        this.results = results;
    }

    public void setOper(operator oper) {
        this.oper = oper;
    }

    public double arithmeticCaculator(double Num1, char Operator, double Num2) throws Exception {
        double result = 0;
        if (Operator == add) { // operation 값이 +면
            setOper(new AddOperator()); // Oper를 AddOperator 인스턴스 객체로 바꾸고
            // 다음 값을 result에 저장한다
        } else if (Operator == sub) {  // 상동
            setOper(new SubtractOperator());
        } else if (Operator == mul) {
            setOper(new MultiplyOperator());
        } else if (Operator == div) {
            if (Num1 < 1 || Num1 % 1 != 0) {
                throw new exception("분자에 0이 올 수 없습니다. 양의 정수값을 입력했는지");
            } else if (Num2 < 1 && Num2 % 1 != 0) {
                throw new exception("분모에 0이 올 수 없습니다. 양의 정수값을 입력했는지");
            } else {
                setOper(new DivideOperator());
            }
        } else if (Operator == re) {
            setOper(new ModOperator());
        } else {
            throw new exception("사칙연산값을 입력했는지");
        }
        result = this.oper.operate(Num1, Num2);
        System.out.println("결과 : " + result);
        this.results.add(result);
        Scanner sc = new Scanner(System.in);


        System.out.println("입력 값보다 큰 값 조회");
        double print = sc.nextDouble(); // //**여기서 double이 아닌 값이 입력됐을때 예외처리를 해주려면?
        getPrint(print);

        return result;

    }
    //입력값보다 큰 값을 조회하는 메서드
    public void getPrint (double printnumber)throws Exception{
    this.results.stream().filter(number -> number > printnumber).forEach(number -> System.out.println(number + " "));
    }
}


interface operator {
    double operate(double a, double b) throws Exception;
}
