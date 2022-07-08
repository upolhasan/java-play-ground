package udemyjavadsa.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DecimalToBinaryTest {

  DecimalToBinary decimalToBinary;
  @BeforeEach
  void setUp() {
    decimalToBinary = new DecimalToBinary();
  }

  @Test
  public void testHappyPath() {
    assertEquals("1101", decimalToBinary.convert(13));
    assertEquals("1010", decimalToBinary.convert(10));
    assertEquals("1000", decimalToBinary.convert(8));

    assertEquals(1101, decimalToBinary.convertAsNumber(13));
    assertEquals(1010, decimalToBinary.convertAsNumber(10));
    assertEquals(1000, decimalToBinary.convertAsNumber(8));
  }
}