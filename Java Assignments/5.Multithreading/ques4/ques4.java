// Try shutdown() and shutdownNow() and observe the difference.

//  shutdown() will just tell the executor service that it can't accept new tasks, but the already
//  submitted tasks continue to run.
//  shutdownNow() will do the same & will try to cancel the already submitted tasks by interrupting the
//  relevant threads. If your tasks ignore the interruption, shutdownNow will behave exactly the same way
//  as shutdown.



import java.util.concurrent.*;
public class ques4 {
    ExecutorService executor;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("interrupted");
                        break;
                    }
                }
            }
        });

        executor.shutdown();
        if (!executor.awaitTermination(100, TimeUnit.MICROSECONDS)) {
            System.out.println("Exiting forcefully");
            executor.shutdownNow();
        }else System.out.println("Exiting normally");
    }
}