package upol.functional;

public class LambdaExample1 {

    public static void main(String args[]){
/*        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread Executed!!");
            }
        });
        */

    Thread t = new Thread(()-> System.out.println("Thread Executed!!!"));
        t.start();
    }
}
