package upol.multithreading;

import java.util.concurrent.Callable;

class CallableTask implements Callable<String> {

  /*
  A task that returns a result and may throw an exception. Implementors define a single method with no arguments called call.
  The Callable interface is similar to Runnable, in that both are designed for classes whose instances are potentially executed by another thread.
  A Runnable, however, does not return a result and cannot throw a checked exception.
  */
  private final String msg;
  private final int waitUnit;

  CallableTask(String msg, int waitUnit) {
    this.msg = msg;
    this.waitUnit = waitUnit;
  }

  @Override
  public String call() throws Exception {
    Thread.sleep(waitUnit * 1000);
    return "Return from Callable " + msg;
  }
}
