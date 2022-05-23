package upol.functionaloreilly;

public class RunnableDemo {

  public static void main(String[] args) {

    // Java 7 Syntax

    new Thread( new Runnable() {
      @Override
      public void run() {
        System.out.println("Inside Anonymous Runnable");
      }
    }).start();

    // Expression Lambda - Singla Line

    new Thread( () -> System.out.println("Inside Expression Lambda ")).start();

    // Assign lambda to a variable ( Functional Variable )

    Runnable runnable = () -> System.out.println("From variable lambda");

    new Thread( runnable).start();

  }

}
