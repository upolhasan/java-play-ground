package udemyjavadsa.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstCapitalTest {

  private FirstCapital firstCapital;
  @BeforeEach
  void setUp() {
    firstCapital = new FirstCapital();
  }

  @Test
  void first() {
    assertEquals('S', firstCapital.first("appmillerS"));
    assertEquals('M', firstCapital.first("appMillerS"));
    assertEquals('A', firstCapital.first("AppMillerS"));
    assertEquals('\0', firstCapital.first(""));
    assertNotEquals('a', "appmillerS");
    assertNotEquals('a', "appMillerS");
    assertNotEquals('a', "AppmillerS");
  }
}