package udemyjavadsa.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeTest {

  private  Palindrome palindrome;
  @BeforeEach
  void setUp() {
    palindrome = new Palindrome();
  }

  @Test
  void isPalindrome() {
    assertTrue(palindrome.isPalindrome("tacocat"));
    assertTrue(palindrome.isPalindrome("abba"));
    assertFalse(palindrome.isPalindrome("werwer"));
  }
}