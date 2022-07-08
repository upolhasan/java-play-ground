package udemyjavadsa.recursion;

import java.util.Arrays;

public class RecursiveCallback {
    public boolean someRecursive(int[] arr, OddFunction odd) {

      if (arr == null || arr.length == 0 ){
        return false;
      }
      if (odd.run(arr[0])) {
        return true;
      }
      return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);

    }

}