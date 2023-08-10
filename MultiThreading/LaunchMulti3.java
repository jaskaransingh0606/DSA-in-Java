
class MyThread extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}

public class LaunchMulti3 {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        MyThread t=new MyThread();
        t.start();
        
    }
    
}
