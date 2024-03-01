package upol.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductExceptSelfTest {

    ProductExceptSelf productExceptSelf;
    @BeforeEach
    void setUp() {
        productExceptSelf = new ProductExceptSelf();
    }

    @Test
    void calculateIn2Pass() {
        int[] input1 = new int[]{1,2,3,4};
        int[] expectedArray1 = new int[]{24,12,8,6};
        assertArrayEquals(expectedArray1, productExceptSelf.calculateIn2Pass(input1) );

        int[] input2 = new int[]{-1, 2, 3, 5, 0};
        int[] expectedArray2 = new int[]{0, 0, 0, 0, -30};
        assertArrayEquals(expectedArray2, productExceptSelf.calculateIn1Pass(input2) );
    }

    @Test
    void calculateIn1Pass() {

        int[] input1 = new int[]{1,2,3,4};
        int[] expectedArray1 = new int[]{24,12,8,6};
        assertArrayEquals(expectedArray1, productExceptSelf.calculateIn2Pass(input1) );

        int[] input2 = new int[]{-1, 2, 3, 5, 0};
        int[] expectedArray2 = new int[]{0, 0, 0, 0, -30};
        assertArrayEquals(expectedArray2, productExceptSelf.calculateIn1Pass(input2) );
    }
}