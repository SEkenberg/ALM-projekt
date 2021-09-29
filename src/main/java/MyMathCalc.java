/**
 * Created by Simon Ekenberg
 * Date: 2021-09-29
 * Time: 13:39
 * Project: IntelliJ IDEA
 * Copyright: MIT
 */
public class MyMathCalc {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(float a, float b ) {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("The value can't be under 0.");
        }
        return a / b;
    }
}