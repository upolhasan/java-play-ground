package udemyjavadsa.recursion;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    private static Factorial factorial;

    @BeforeClass
    public static void setup(){
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