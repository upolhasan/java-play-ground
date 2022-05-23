package upol.rxjava;

public class CallBackDemo {

  public static void main(String[] args) {
    System.out.println("Main thread is running");

    Runnable r = new Runnable() {
      @Override
      public void run() {
        new CallBackDemo().runningAsync( new CallBack(){

          @Override
          public void call() {
            System.out.println("Callback Called");
          }
        });
      }
    };
    Thread thread1 = new Thread(r);
    thread1.start();
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("main thread completed " + Thread.currentThread().getName());
  }

  public void runningAsync(CallBack callBack){
    System.out.println("I'm running on a separate thread");
    pause(1000);
    callBack.call();
  }

  private void pause(int duration) {
    try {
      Thread.sleep(duration);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

}
