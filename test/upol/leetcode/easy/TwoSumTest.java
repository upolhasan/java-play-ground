package upol.leetcode.easy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    TwoSum twoSum;
    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    void test1(){

        assertArrayEquals(twoSum.getTwoSum(new int[]{2,7,11,15}, 9), new int[]{0,1});
    }
}