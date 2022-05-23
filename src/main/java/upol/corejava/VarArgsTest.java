package upol.corejava;

import java.util.Arrays;

public class VarArgsTest {

  public static void printInts( int... values ){

    System.out.println(Arrays.toString(values));
  }

  public static  int sumOfInt( int... values ){

    int sum = 0;

    for (int val: values
    ) {
      sum += val;
    }
    return sum;
  }

  public static void main(String[] args){

    printInts(1,2,3,4,5);
    System.out.println(" Total sum: "  + sumOfInt(1,2,3,4,5));
  }
}
