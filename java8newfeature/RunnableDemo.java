import java.lang.*;

public final class RunnableDemo {

    public static void main(String[] args) throws InterruptedException {
       //threadwithRunnable(); 
       threadwithLambda();
    }

    private static void threadwithRunnable() throws InterruptedException {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Hello from thread " + Thread.currentThread().getName());
                }
            }
        };

        Thread t = new Thread(runnable);
        t.start();
        t.join();
    }

    private static void threadwithLambda() throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("this is call from lambda");
        });
        t.start();
        t.join();
    }
}
