package udemyjavadsa.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GcdTest {

  Gcd gcd;
  @BeforeEach
  void setUp() {
    gcd = new Gcd();
  }

  @Test
  public void testHappyPath() {
    assertEquals( 2, gcd.calculate(48, 22));
    assertEquals( 4, gcd.calculate(48, 20));
  }
}