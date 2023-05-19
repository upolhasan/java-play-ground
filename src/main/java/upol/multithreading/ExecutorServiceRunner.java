package upol.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

  /*

  ExecutorService helps us to kick off multiple Threads at the same time.
  It helps us to manage and monitor the state of these Threads and
  it helps us to write logic which enables us to custom ways to manage the threads.


   */

  public static void main(String[] args) {
    // Facilitates to run a single thread at a time
//    ExecutorService executorService = Executors.newSingleThreadExecutor();
//    executorService.execute(new Task1());
//    executorService.execute(new Thread(new Task2()));
//    executorService.shutdown();

    // Define number of active threads
    ExecutorService executorService1 = Executors.newFixedThreadPool(5);
    executorService1.execute(new Task(1));
    executorService1.execute(new Task(2));
    executorService1.execute(new Task(3));
    executorService1.execute(new Task(4));
    executorService1.execute(new Task(5));
    executorService1.execute(new Task(6));


    //Task3
//    System.out.println(" \nTask 3 Started\n");
//    for (int i = 301; i <400 ; i++) {
//      System.out.print( i + " ");
//    }
//    System.out.println("\nTask3 Done");
//    System.out.println("\nMain Done");

    executorService1.shutdown(); // Otherwise the programm will keep running.
  }

}
