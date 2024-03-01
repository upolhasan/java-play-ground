package upol.leetcode.medium;

/*
*
* 238. Product of Array Except Self (https://leetcode.com/problems/product-of-array-except-self/description/)
Solved
Medium
Topics
Companies
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
*
* */

import java.util.Arrays;

public class ProductExceptSelf {

    public int[] calculateIn2Pass ( int[] num ) {

        int[] result = new int[num.length];

        // Create prefix multiplication Array
         int prefixMultiplication = 1;

         for ( int i = 0; i < num.length; i++ ){
             result[i] = prefixMultiplication;
             prefixMultiplication *=num[i];
         }

         /*
         * [1,2,3,4] => [1, 1, 2, 6]
         * [1,2,3,4] => [24, 12, 8, 6]
         *
         * */
        int postFixMultiplication = 1;

        for ( int i = num.length - 1; i >=0; i-- ){
            result[i] *= postFixMultiplication;
            postFixMultiplication *= num[i];
        }


        return result;
    }

    public int[] calculateIn1Pass( int[] num ){

        // 2 pointer
        int left = 0, right = num.length-1;
        int prefixProduct = 1, suffixProduct = 1;
        int[] result = new int[num.length];
        Arrays.fill(result, 1);

        while ( left < num.length && right >= 0 ) {
            result[left] *= prefixProduct;
            result[right] *= suffixProduct;

            prefixProduct *= num[left];
            suffixProduct *= num[right];

            left++;
            right--;
        }
        return result;
    }
}
