package upol.multithreading;

/*
 -- Two ways to create thread:

  1. Extend Thread Class
  2. Implement Runnable interface

  -- States:

  * NEW ( Ready to run )
  * RUNNABLE ( When the other thread is currently executing )
  * RUNNING ( Currently Executing )
  * BLOCKED/WAITING ( Waiting for external service / thread for completion )
  * TERMINATED/DEAD ( Done executing )

  Thread Priority Values:

    It's just a request ( hint to the scheduler ) to have more priority but the priority is never guranteed
    MIN_PRIORITY = 1;
    NORM_PRIORITY = 5;
    MAX_PARIORITY = 10;


  -- Utility methods:
    * Thread.sleep(int milliseconds) - Puts the current thread to sleep for specified milliseconds.
    * Thread.yield() - Requests the scheduler  ( hint to the scheduler )  to willing to go to WAITING state
    * synchronized keyword - Only one thread is allowed to execute a synchronized method and other threads need to wait.
      Will put a lot of overhead on the performance as only one thread can execute a syncronized method leaving
      all other threads in waiting state. e.g. HashTable

      - From Java 5 and 8 there are other better ways to provide thread safety by means of Concurrent Collections

 */

class Task extends Thread{

  private int index;

  public Task(int index){
    this.index = index;
  }

  public void run(){

    System.out.println("\nTask " + index + " Entered\n");
    int start = index * 100;
    int end = start + 99;
    for (int i = start ; i < end ; i++) {
      System.out.print( i + " ");
    }
    System.out.println("\nTask " + index + " Done");

  }
}

class Task1 extends Thread{

   @Override
  public void run(){
    System.out.println("\nTask 1 Entered\n");
    for (int i = 101; i <200 ; i++) {
      System.out.print( i + " ");
    }
    System.out.println("\nTask1 Done");
  }
}

class Task2 implements Runnable{

  @Override
  public void run() {
    System.out.println("\nTask 2 Entered\n");
    for (int i = 201; i <300 ; i++) {
      System.out.print( i + " ");
    }
    System.out.println("\nTask2 Done");
  }
}

public class ThreadBasicsRunner {

  public static void main(String[] args) {
    
    //Task1
    Task1 task1 = new Task1();
    task1.setPriority(Thread.MAX_PRIORITY);
    task1.start();

    //Task2

    Task2 task2 = new Task2();
    Thread task2Thread = new Thread(task2);
    task2Thread.start();

    // Wait for task1 to complete
    /*
    * join() method to make the main thread wait for a particular thread is finished execution
    * */
    try {
      task1.join();
      task2Thread.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    //Task3
    System.out.println(" \nTask 3 Started\n");
    for (int i = 301; i <400 ; i++) {
      System.out.print( i + " ");
    }
    System.out.println("\nTask3 Done");
    System.out.println("\nMain Done");

  }
}
