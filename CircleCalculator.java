package Work;

import java.util.List;

public class CircleCalculator extends Calculator {


    public CircleCalculator(List<Double> results) {
        super(results);
    }

    public double circleCalculator(double Radius) throws Exception {

        double result = 0;

        double PI = 3.14159265358979323846264338327950288419716939937510582097494459230781640628;

        if (Radius <= 0) {
            throw new exception("양의 정수값을 입력했는지");
        }
        result = (Radius * Radius) + PI;
        System.out.println("결과 : " + result);
        Circleresults.add(result);
        return result;
    }

}


