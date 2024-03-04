package upol.leetcode.hard;

/* Neetcode: https://www.youtube.com/watch?v=ZI2z5pq0TqA

Leetcode: https://leetcode.com/problems/trapping-rain-water/description/

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.


Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9


Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
*
* */

public class RainWater {

    public int getWaterAmount(int[] heights) {

        int len = heights.length;
        int[] maxLeft  = new int[len], maxRight = new int[len],  waterAmount = new int[len];
        maxLeft[0] = 0;
        maxRight[len-1] = 0;
        int sum = 0;

        // 1st pass - build the maxLeft array
        for ( int i = 1; i < len; i++ ){
            maxLeft[i] = Math.max(heights[i-1], maxLeft[i-1] );
        }
        // 2nd pass - build the maxRight array
        for (int i = len - 2; i > -1; i-- ){
            maxRight[i] = Math.max(heights[i+1], maxRight[i+1]);
        }
        // Claculate waterAmount in each position
        for ( int i = 0; i < len; i++ ){
            waterAmount[i] = Math.min(maxRight[i], maxLeft[i]) - heights[i];
        }
        // Sum it up
        for ( int num: waterAmount ) {
            if ( num < 0 ){
                continue;
            }
            sum += num;
        }
        return sum;
    }

    public int getWaterAmountOptimized( int[] heights ) {
        int sum = 0;

        if ( heights.length < 1 ){
            return sum;
        }

        int left = 0, right = heights.length -1;
        int maxLeft = heights[left], maxRight = heights[right];

        while ( left <= right ){

            if (  maxLeft <= maxRight ){

                if ( maxLeft >= heights[left] ) {
                    sum += maxLeft - heights[left];
                } else {
                    maxLeft = heights[left];
                }
                left++;

            } else {

                if ( maxRight >= heights[right] ) {
                    sum += maxRight - heights[right];
                } else {
                    maxRight = heights[right];
                }
                right--;
            }
        }

        return sum;
    }

    public int getWaterAmountOptimizedCode( int[] heights ) {
        int sum = 0;

        if ( heights.length < 1 ){
            return sum;
        }

        int left = 0, right = heights.length -1;
        int maxLeft = heights[left], maxRight = heights[right];

        while ( left <= right ){

            if ( maxLeft <  maxRight) {
                maxLeft = Math.max(maxLeft, heights[left]);
                sum += maxLeft - heights[left];
                left++;

            } else {

                maxRight = Math.max(maxRight, heights[right]);
                sum += maxRight - heights[right];
                right--;
            }
        }

        return sum;
    }

}
