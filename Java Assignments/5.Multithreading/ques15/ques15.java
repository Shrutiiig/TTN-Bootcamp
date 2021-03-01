// signal() -> Wakes up one waiting thread.
// signalAll() -> Wakes up all waiting threads.

// how to use signal all?

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Task
{
    private int count=0;
    private Lock lock=new ReentrantLock();
    private Condition condition=lock.newCondition();
    private void increment()
    {
        for(int i=0;i<100;i++)
        {count++;}
    }

    public void firstThread()  throws InterruptedException
    {    lock.lock();
        System.out.println("Waiting .....");

        condition.await();

        try{
            increment();
        }
        finally{
            lock.unlock();
        }
    }
    public void secondThread()  throws InterruptedException
    {
        Thread.sleep(1000);

        lock.lock();
        System.out.println("Press any key");
        new Scanner(System.in).nextLine();
        System.out.println("key pressed");

        condition.signal();
        try{
            increment();
        }
        finally{
            lock.unlock();
        }
    }

    public void finished()
    {
        System.out.println("Count is :"+count);
    }
}

public class ques15 {

    public static void main(String[] args) throws InterruptedException{

        Task task = new Task();
        Thread t1= new Thread(new Runnable(){
            @Override
            public void run()
            {
                try{
                    task.firstThread();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        Thread t2= new Thread(new Runnable(){
            @Override
            public void run()
            {
                try{
                    task.secondThread();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        task.finished();
    }
}
