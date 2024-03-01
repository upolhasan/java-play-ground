package upol.leetcode.hard;

public class RainWater {

    public int getWaterAmount(int[] heights) {

        int len = heights.length;
        int[] maxLeft  = new int[len], maxRight = new int[len],  waterAmount = new int[len];
        maxLeft[0] = 0;
        maxRight[len-1] = 0;
        int sum = 0;

        for ( int i = 1; i < len; i++ ){
            maxLeft[i] = Math.max(heights[i-1], maxLeft[i-1] );
        }

        for (int i = len - 2; i > -1; i-- ){
            maxRight[i] = Math.max(heights[i+1], maxRight[i+1]);
        }

        for ( int i = 0; i < len; i++ ){
            waterAmount[i] = Math.min(maxRight[i], maxLeft[i]) - heights[i];
        }

        for ( int num: waterAmount ) {
            if ( num < 0 ){
                continue;
            }
            sum += num;
        }

        return sum;
    }

}
