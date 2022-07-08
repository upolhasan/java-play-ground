package udemyjavadsa.recursion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductOfAnArrayTest {

  private ProductOfAnArray productOfAnArray;
  @BeforeEach
  void setUp() {
    productOfAnArray = new ProductOfAnArray();
  }

  @Test
  void testSumOfAnArrayHappyPath() {
    assertEquals(189, productOfAnArray.calculate(new int[]{3,9,7}, 3));
    assertEquals(27, productOfAnArray.calculate(new int[]{3,9}, 2));
    assertEquals(3, productOfAnArray.calculate(new int[]{3}, 1));
  }

  @Test
  void testSumOfAnArrayFailureCases(){
    assertEquals(-1, productOfAnArray.calculate(null, 0));
    assertEquals(-1, productOfAnArray.calculate(new int[]{3}, 2));
    assertEquals(-1, productOfAnArray.calculate(new int[]{3}, -2));
  }
}