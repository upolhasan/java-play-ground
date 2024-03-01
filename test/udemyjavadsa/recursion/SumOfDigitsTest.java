package udemyjavadsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {

    public static SumOfDigits sumOfDigits;

    @BeforeEach
    void setUp() {
        sumOfDigits = new SumOfDigits();
    }

    @Test
    public void testHappyPath() {
        assertEquals(4, sumOfDigits.calculate(112));
        assertEquals(2, sumOfDigits.calculate(11));
        assertEquals(9, sumOfDigits.calculate(9));
        assertEquals(9, sumOfDigits.calculate(111111111));
    }
    @Test
    public void testNegativeOrZero(){
        assertEquals(0,sumOfDigits.calculate(0));
        assertEquals(0, sumOfDigits.calculate(-10));
    }
}

