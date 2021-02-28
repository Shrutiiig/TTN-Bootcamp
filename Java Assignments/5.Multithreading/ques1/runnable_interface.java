// Create and Run a Thread using Runnable Interface and Thread class.

class runnable_interface implements Runnable{
    public void run(){
        System.out.println("thread is running");
    }

    public static void main(String args[]){
        runnable_interface demo = new runnable_interface();
        Thread t1 = new Thread(demo);
        t1.start();
    }
}