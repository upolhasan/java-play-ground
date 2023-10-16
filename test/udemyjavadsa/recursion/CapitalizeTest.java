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
        assertEquals("I Love Java", capitalize.capitalizeWord("i love java"));
        assertEquals("We Love Java", capitalize.capitalizeWord("we love java"));
        assertEquals("We Love Java", capitalize.capitalizeWord("we love java     "));
        assertEquals("We Love Java", capitalize.capitalizeWord("     We love java     "));
        assertEquals("We Love Java", capitalize.capitalizeWord("     We       love        java     "));

    }
}