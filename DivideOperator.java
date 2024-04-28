package Work;

public class DivideOperator {
    public double operate(double a, double b) throws Exception{
        if (a < 1 || b % 1 != 0) {
            throw new exception("양의 정수값을 입력했는지");
        } else if (b < 1 && b % 1 != 0) {
            throw new exception("양의 정수값을 입력했는지");
        } else { return a/b; }
    }
}
