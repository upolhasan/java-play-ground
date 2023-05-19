package upol.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    RomanToInteger converter;

    @BeforeEach
    void setUp(){
        converter = new RomanToInteger();
    }

    @Test
    void testHappyPath1(){
        assertEquals(3, converter.romanToInt("III"));
        assertEquals(58, converter.romanToInt("LVIII"));
        assertEquals(1994, converter.romanToInt("MCMXCIV"));
    }

}