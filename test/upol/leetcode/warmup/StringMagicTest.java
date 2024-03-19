package upol.leetcode.warmup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringMagicTest {

    StringMagic stringMagic;
    @BeforeEach
    void setUp() {
        stringMagic = new StringMagic();
    }

    @Test
    void areAnagrams() {
        assertTrue(stringMagic.areAnagrams("Silent", "Listen"));
    }

}