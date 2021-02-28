import java.io.*;
import java.lang.*;
import java.util.*;

class myThread extends Thread {

    int sum = 0;
    public void run()
    {
        synchronized (this)
        {
            System.out.println("child thread start calculation");
            for (int i = 0; i <= 100; i++) sum += i;

            System.out.println("child thread trying to give notification");
            this.notifyAll();
        }
    }
}

public class ques14 {
    public static void main(String[] args) throws InterruptedException
    {
        myThread t1 = new myThread();
        t1.start();

        synchronized (t1)
        {
            System.out.println("main thread trying to call wait method");
            t1.wait();

            System.out.println("main thread get notify");
            System.out.println(t1.sum);
        }
    }
}