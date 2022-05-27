package udemyjavadsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    private static Fibonacci fibonacci = new Fibonacci();

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void calculateHappyPath() {
        assertEquals(3, fibonacci.calculate(4), 3);
        assertEquals(2, fibonacci.calculate(3), 2);
        assertEquals(5, fibonacci.calculate(5), 5);
        assertEquals(8, fibonacci.calculate(6), 8);
        assertEquals(55, fibonacci.calculate(10), 55);
    }

    @Test
    public void testNegative(){
        assertEquals(fibonacci.calculate(-10), -1);
    }

    @Test
    public void testZeroAndOne(){
        assertEquals(fibonacci.calculate(0), 0);
        assertEquals(fibonacci.calculate(1), 1);
    }
}