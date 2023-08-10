
class Car implements Runnable {
    // synchronized public void run(){ // synchronized keyword is used to make the
    // method thread safe
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Has entered the parking lot");
            Thread.sleep(2000);

           synchronized(this)       // synchronized block is used to make the method thread safe
           {
                System.out.println(Thread.currentThread().getName() + " Got into car to drive");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " Started to drive the car");
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " came back and parked the car");

            }

        }

        catch (Throwable e) {
            System.out.println(e);
        }

    }
}

public class Sync {
    public static void main(String[] args) {

        Car c = new Car();

        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("Son 1");
        t2.setName("Son 2");
        t3.setName("Son 3");

        t1.start();
        t2.start();
        t3.start();

    }

}
