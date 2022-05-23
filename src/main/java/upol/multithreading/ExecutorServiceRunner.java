package upol.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

  public static void main(String[] args) {
//    ExecutorService executorService = Executors.newSingleThreadExecutor(); // Facilitates to run a single thread at a time
//    executorService.execute(new Task1());
//    executorService.execute(new Thread(new Task2()));

    ExecutorService executorService1 = Executors.newFixedThreadPool(2);
    executorService1.execute(new Task(1));
    executorService1.execute(new Task(2));
    executorService1.execute(new Task(3));
    executorService1.execute(new Task(4));

    //Task3
//    System.out.println(" \nTask 3 Started\n");
//    for (int i = 301; i <400 ; i++) {
//      System.out.print( i + " ");
//    }
//    System.out.println("\nTask3 Done");
//    System.out.println("\nMain Done");

    executorService1.shutdown();
  }

}
