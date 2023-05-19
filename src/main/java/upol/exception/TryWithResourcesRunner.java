package upol.exception;

import java.util.Scanner;

public class TryWithResourcesRunner {

  public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in)){
      System.out.println("Enter 2 numbers: ");
      int num1 = scanner.nextInt();
      int num2 = scanner.nextInt();
      int[] arr = {num1, num2};
      System.out.println(arr[2]);
      System.out.println("End of main");
    }
  }

}
