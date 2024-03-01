package upol.leetcode.hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RainWaterTest {

    RainWater rainWater;
    @BeforeEach
    void setUp() {
        rainWater = new RainWater();
    }

    @Test
    void getWaterAmount() {
        assertEquals(9, rainWater.getWaterAmount(new int[]{0, 1, 3, 1, 0, 1, 4, 0, 2}));
        assertEquals(3, rainWater.getWaterAmount(new int[]{0, 1, 2, 0, 1, 3}));
    }
}