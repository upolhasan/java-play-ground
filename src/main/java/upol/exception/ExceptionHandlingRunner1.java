package upol.exception;

public class ExceptionHandlingRunner1 {
  // Example of unhandled exception thrown out through the calling chain
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
    int size = s.length();
    System.out.println("From method2");
  }

}
