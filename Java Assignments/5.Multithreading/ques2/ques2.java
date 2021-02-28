// Use sleep and join methods with thread.

import java.lang.*;

public class ques2 implements Runnable{
    Thread t;
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new ques2());
        t.start();
        t.join(1000);
        System.out.println("\n Joining after 1000" + " mili seconds: \n");
    }
}