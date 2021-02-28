// Use isShutDown() and isTerminated() with ExecutorService.

// isShutdown()– The function tells whether the invoking executor is shutdown or not. Returns true if
// shutdown, otherwise returns false.

// isTerminated()– The function checks if all the tasks have been completed post shutdown. Return true
// if completed, otherwise returns false.


import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;

public class ques5   {
    public static void main(final String[] arguments) throws InterruptedException {
        ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newCachedThreadPool();
        executor.submit(new Task());
        executor.submit(new Task());
        executor.shutdown();
        System.out.println("get Task count after:"+ executor.getTaskCount());
        System.out.println(" Is Executor Terminated :"+ executor.isTerminated());
        System.out.println(" Is Executor Shut Down :"+ executor.isShutdown());
    }

    static class Task implements Runnable {
        @Override
        public void run() {
            try {
                Long duration = (long) (Math.random() * 5);
                System.out.println("Running Thread Name: " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(duration);
                System.out.println("Completed Thread Name: " +Thread.currentThread().getName());
            } catch (InterruptedException e) {  }
        }
    }
}

