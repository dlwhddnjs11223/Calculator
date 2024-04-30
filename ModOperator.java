package Work;

public class ModOperator implements operator {


    @Override
    public double operate(double a, double b) throws Exception {
        return a%b;
    }
}
