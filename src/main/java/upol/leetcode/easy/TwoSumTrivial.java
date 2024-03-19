package upol.leetcode.easy;

import java.util.Arrays;

public class TwoSumTrivial {

  public static int[] getTwoSumIndices( int[] nums, int sum){

    int target, num1, num2;

    for (int i = 0; i < nums.length; i++) {
      num1 = nums[i];
      target = sum - num1;
      for (int j = i+1; j < nums.length ; j++) {
        num2 = nums[j];
        if ( num2 == target )
          return new int[]{i, j};
      }
    }

    return null;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(getTwoSumIndices(new int[]{1,3,7,9,2}, 11)));
  }

}
