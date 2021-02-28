// Create and Run a Thread using Runnable Interface and Thread class.

class thread_class extends Thread{
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String args[]){
        thread_class t1 = new thread_class();
        t1.start();
    }
}