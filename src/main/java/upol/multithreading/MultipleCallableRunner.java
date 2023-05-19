package upol.multithreading;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

  public static void main(String[] args) throws InterruptedException, ExecutionException {

    List<CallableTask> callableTasks = List.of( new CallableTask("Task1", 10),
        new CallableTask("Task2", 1),
        new CallableTask("Task3", 1));

    ExecutorService executorService = Executors.newFixedThreadPool(3); // play with changing the threadpool value
    // Invoke all the threads and wait for all of them to finish
//    final List<Future<String>> futuresAll = executorService.invokeAll(callableTasks);
//    System.out.println("Invoke all called");
//
//    for (Future future: futuresAll){
//      System.out.println(future.get());
//    }

    // Invoke all the threads but return the 1st one that completes execution
    String strAny = executorService.invokeAny(callableTasks);
    System.out.println("Invoke any called");
    System.out.println(" Invoke Any Result: " + strAny);

    executorService.shutdown();
  }
}
