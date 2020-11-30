package dziedziczenie_05;

import ZD1.Calculator;

public class AdvancedCalculator extends Calculator {

    public double pow(double x, double y) {
        double result = Math.pow(x, y);
        saveOperation(x + "^" + y + "equals" + result);
        return result;
    }
    public double root(double x, double y) {
        double result = Math.sqrt(x);
        saveOperation(y + "root of" + x + "equals" + result);
        return result;
    }
}