package udemyjavadsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerOfANumberTest {

    PowerOfANumber powerOfANumber;
    @BeforeEach
    void setUp() {
        powerOfANumber = new PowerOfANumber();
    }

    @Test
    public void TestHappyPath() {
        assertEquals(8, powerOfANumber.calculate(2, 3) );
        assertEquals(-8, powerOfANumber.calculate(-2, 3) );
        assertEquals(1, powerOfANumber.calculate(2, 0) );
        assertEquals(2, powerOfANumber.calculate(2, 1) );
    }
}