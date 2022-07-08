package udemyjavadsa.recursion;

public class ProductOfAnArray {

  public int calculate( int[] arr, int length ){
    if (arr == null || arr.length < length || length < 1)
      return -1;

    if (length ==1){
      return arr[0];
    }

    String s = "test";
    final String substring = s.substring(0, 3);
    System.out.println(substring);
    return arr[length-1] * calculate(arr, length-1);
  }

}
