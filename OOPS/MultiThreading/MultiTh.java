

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class MultiTh {
    public static void main(String[] args) {
        String name=Thread.currentThread().getName();
        System.out.println(name);
        System.out.println(Thread.currentThread().getPriority());
        Thread t=Thread.currentThread();
        t.setPriority(4);
         System.out.println(Thread.currentThread().getPriority());

        MyThread t1=new MyThread();
        t1.start();
    }
    
}
