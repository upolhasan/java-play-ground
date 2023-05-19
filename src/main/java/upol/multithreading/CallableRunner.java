package upol.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

      ExecutorService executorService = Executors.newFixedThreadPool(1);
      final Future<String> futureTask = executorService.submit(new CallableTask("Task 1", 1));
      System.out.println(" Before getting Result");
      String result = futureTask.get();
      System.out.println("Result from call method : " + result);
      System.out.println("After getting result");
      System.out.println("End of main");
      executorService.shutdown();
    }

  }
