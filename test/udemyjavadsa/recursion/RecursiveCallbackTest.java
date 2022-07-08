package udemyjavadsa.recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RecursiveCallbackTest {

  private RecursiveCallback recursiveCallback;
  private OddFunction odd;
  @BeforeEach
  void setUp() {
    recursiveCallback = new RecursiveCallback();
    odd = new OddFunction();
  }

  @Test
  void testRecusriveCallback(){
    int[] arr1 = new int[] {1,2,3,4};
    int[] arr2 = new int[] {4,6,8,9};
    int[] arr3 = new int[] {4,6,8};

    assertTrue(recursiveCallback.someRecursive(arr1, odd));
    assertTrue(recursiveCallback.someRecursive(arr2, odd));
    assertFalse(recursiveCallback.someRecursive(arr3, odd));
  }
}