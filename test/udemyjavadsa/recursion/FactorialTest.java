package udemyjavadsa.recursion;


import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    private Factorial factorial;

    @BeforeClass
    public void setup(){
        factorial = new Factorial();
    }

    @Test
    public void testHappyPath(){
        assertEquals(120, factorial.calculate(5));
    }
    @Test
    public void testNegaticeResult(){
        assertEquals(-1, factorial.calculate(-10));
    }
    @Test
    public void testZero(){
        assertEquals(1, factorial.calculate(0));
    }
}