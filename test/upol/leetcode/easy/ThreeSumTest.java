package upol.leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import upol.leetcode.medium.ThreeSum;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    ThreeSum threeSum;
    @BeforeEach
    void setUp() {
        threeSum = new ThreeSum();
    }

    @Test
    void isThreeSumNaive() {
        assertTrue(threeSum.isThreeSumNaive(new int[]{3,7,1,2,8,4,5}, 20));
        assertFalse(threeSum.isThreeSumNaive(new int[]{-1,2,1,4}, 1));
        assertTrue(threeSum.isThreeSumNaive(new int[]{-1,2,1,4,-2}, 1));
    }

    @Test
    void isThreeSumOptimized(){
        assertTrue(threeSum.isThreeSumOptimized(new int[]{3,7,1,2,8,4,5}, 20));
        assertFalse(threeSum.isThreeSumOptimized(new int[]{-1,2,1,4}, 1));
        assertTrue(threeSum.isThreeSumOptimized(new int[]{-1,2,1,4,-2}, 1));
    }
}