package upol.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram;
    @BeforeEach
    void setUp() {
        anagram = new Anagram();
    }

    @Test
    void test1() {
        assertTrue( anagram.isAnagram("anagram", "nagaram"));
        assertTrue( anagram.isAnagram("anagram&$", "&$nagaram"));
        assertFalse( anagram.isAnagram("Anagram", "nagaram"));
        assertFalse( anagram.isAnagram("anagram", "nagarax"));
    }
    @Test
    void test2() {
        assertTrue( anagram.isAnagram1("anagram", "nagaram"));
        assertFalse( anagram.isAnagram1("Anagram", "nagaram"));
        assertFalse( anagram.isAnagram1("anagram", "nagarax"));
    }
    @Test
    void test3() {
        assertTrue( anagram.isAnagram2("anagram", "nagaram"));
        assertTrue( anagram.isAnagram2("Anagram", "Anagram"));
        assertTrue( anagram.isAnagram2("Anagram", "nagaram"));
        assertFalse( anagram.isAnagram2("anagram", "nagarax"));
    }
}