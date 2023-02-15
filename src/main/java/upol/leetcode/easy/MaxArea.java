package upol.leetcode.easy;

public class MaxArea {

  public int maxArea(int[] height) {
    int maxarea = 0, l = 0, r = height.length - 1;
    while (l < r) {
      maxarea = Math.max(maxarea, Math.min(height[l],
          height[r]) * (r - l));
      if (height[l] < height[r])
        l++;
      else
        r--;
    }
    return maxarea;
  }

  public static void main(String[] args) {

    MaxArea maxArea = new MaxArea();


    int[] numbers = {1,5,2,7,8,19};
    System.out.println("Test " +  maxArea.maxArea(numbers));

  }
}

