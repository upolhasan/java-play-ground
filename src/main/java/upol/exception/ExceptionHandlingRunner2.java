package upol.exception;

public class ExceptionHandlingRunner2 {
  // Example of exception handling
  public static void main(String[] args) {
    method1();
    System.out.println("From Main");
  }

  private static void method1() {
    method2();
    System.out.println("From method1");
  }

  private static void method2() {
    String s = null;

    try{
      int size = s.length();
    } catch (RuntimeException e ){
      e.printStackTrace();
    }
    System.out.println("From method2");
    method3();
  }

  private static void method3() {
    int[] arr = {1,2,3};
    try{
      int val = arr[2]; // play with this value
      System.out.println(" I am not executed if there's an exception !!!");
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println("Matched ArrayOutOfBoundException");
      e.printStackTrace();
    } catch (Exception e ){
      System.out.println("Matched Exception");
      e.printStackTrace();
    }

    System.out.println("From method3");
  }

}
