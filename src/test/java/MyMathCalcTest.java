import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyMathCalcTest {
    MyMathCalc mathCalc;

    @BeforeEach
    void init(){
        mathCalc = new MyMathCalc();
    }


    @Test
    void add() {
        int a = 1;
        int b = 2;

        int x = mathCalc.add(a, b);
        assertEquals(3, x);
    }

    @Test
    void multiply() {
        int a = 1;
        int b = 2;

        int x = mathCalc.multiply(a, b);
        assertEquals(2, x);
    }

    @Test
    void divide() {
        int a = 10;
        int b = 5;

        double x = mathCalc.divide(a, b);
        assertEquals(2, x);
    }

    @Test
    void divideByZero() {
        int a = 8;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> {
            mathCalc.divide(a, b);
        });
    }
}