package udemyjavadsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    //  n ->  0, 1, 2, 3, 4, 5, 6, 7, 8
    // Fib -> 0, 1, 1, 2, 3, 5, 8, 13, 21
    private static Fibonacci fibonacci = new Fibonacci();

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void calculateHappyPath() {
        assertEquals(3, fibonacci.calculate(4) );
        assertEquals(2, fibonacci.calculate(3) );
        assertEquals(5, fibonacci.calculate(5) );
        assertEquals(8, fibonacci.calculate(6) );
        assertEquals(55, fibonacci.calculate(10) );
        assertEquals(1, fibonacci.calculate(1));
        assertEquals(1, fibonacci.calculate(2));
        assertEquals(2, fibonacci.calculate(3));
    }    
    
    @Test
    public void testFibIterative() {
        assertEquals(3, fibonacci.fibIterative(4) );
        assertEquals(2, fibonacci.fibIterative(3) );
        assertEquals(5, fibonacci.fibIterative(5) );
        assertEquals(8, fibonacci.fibIterative(6) );
        assertEquals(55, fibonacci.fibIterative(10) );
        assertEquals(1, fibonacci.fibIterative(1));
        assertEquals(1, fibonacci.fibIterative(2));
        assertEquals(2, fibonacci.fibIterative(3));
    }


    @Test
    public void testFibMemoized() {
        assertEquals(3, fibonacci.fibMemoized(4) );
        assertEquals(2, fibonacci.fibMemoized(3) );
        assertEquals(5, fibonacci.fibMemoized(5) );
        assertEquals(8, fibonacci.fibMemoized(6) );
        assertEquals(55, fibonacci.fibMemoized(10) );
        assertEquals(1, fibonacci.fibMemoized(1));
        assertEquals(1, fibonacci.fibMemoized(2));
        assertEquals(2, fibonacci.fibMemoized(3));
    }

    @Test
    public void testNegative(){
        assertEquals(fibonacci.calculate(-10), -1);
    }

    @Test
    public void testZeroAndOne(){
        assertEquals(0, fibonacci.calculate(0));
        assertEquals(1, fibonacci.calculate(1));
    }
}