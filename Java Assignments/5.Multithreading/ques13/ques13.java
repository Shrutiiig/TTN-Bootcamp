class helper {
    volatile boolean part1done = false;

    synchronized void part1()
    {
        System.out.println("Starting");
        part1done = true;
        System.out.println("Thread t1 about to surrender lock");
        notify();
    }

    synchronized void part2()
    {
        while (!part1done) {
            try {
                System.out.println("Thread t2 is waiting");
                wait();
                System.out.println(
                        "Thread t2 is running again");
            }
            catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
        System.out.println("Ending");
    }
}

public class ques13 {

    public static void main(String[] args)
    {
        helper obj = new helper();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                obj.part1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() { obj.part2(); }
        });

        t2.start();
        t1.start();
    }
}