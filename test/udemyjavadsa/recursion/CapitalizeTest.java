package udemyjavadsa.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTest {

    Capitalize capitalize;
    @BeforeEach
    void setUp() {
        capitalize = new Capitalize();
    }

    @Test
    public void testCapitalize(){
        assertEquals("I Love Java", capitalize.execute("i love java"));
        assertEquals("We Love Java", capitalize.execute("we love java"));
        assertEquals("We Love Java", capitalize.execute("we love java     "));
        assertEquals("We Love Java", capitalize.execute("     We love java     "));
        assertEquals("We Love Java", capitalize.execute("     We       love        java     "));

    }
}