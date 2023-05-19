package upol.exception;

import java.util.Scanner;

public class FinallyRunner {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    try{
      System.out.println("Enter an Integer ");
      int num = scanner.nextInt();
      System.out.println("You entered: " + num);
      int[] arr = {num};
      int test = arr[1];

      System.out.println("Enter a String ");
      String str = scanner.next();
      System.out.println("You entered: " + str);

      System.out.println("Enter a float ");
      float floatNum = scanner.nextFloat();
      System.out.println("You entered: " + floatNum);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Matched ArrayOutOfBoundException");
      e.printStackTrace();
    } finally {
      System.out.println("Closing the scanner");
      if ( scanner != null ){
        scanner.close();
      }
    }
  }

}
