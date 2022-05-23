package upol.corejava;

import java.util.Arrays;

public class ProductWithoutSelf {

  /**
   * Optimized solution without using the array for running suffixes and running prefixes, meaning less actual memory used
   *
   * Time: O(n)
   * Space: O(n)
   *
   * Runtime: 1 ms, faster than 100.00% of Java online submissions for Product of Array Except Self.
   * Memory Usage: 49.5 MB, less than 83.57% of Java online submissions for Product of Array Except Self
   */
  public static int[] productExceptSelf(int[] nums) {
    int[] answers = new int[nums.length];
    answers[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      answers[i] = nums[i - 1] * answers[i - 1];
    }

    System.out.println("answers: " + Arrays.toString(answers));
    System.out.println("nums: " + Arrays.toString(nums));

    int curSuffix = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      answers[i] = curSuffix * answers[i];
      curSuffix *= nums[i];
      System.out.println(curSuffix);
    }
    return answers;
  }

  public static void main(String[] args) {

    //Arrays.stream(productExceptSelf(new int[]{1,2,3,4})).asDoubleStream().forEach(System.out::println);
    System.out.println(Arrays.toString(productExceptSelf(new int[]{3,5,6,7})));
  }

}
