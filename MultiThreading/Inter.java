   
//interrupt method is used to interrupt the thread and is applicable only when thread is in waiting or sleeping state


class Example implements Runnable{
    public void run(){
       for(int i=0;i<=3;i++){
        try{
             System.out.println("Focus is important to master skills");
        //    Thread.sleep(2000);

        }
        catch(Throwable e){
            System.out.println("Thread interrupted");
        }
          

       }    
    }
}


public class Inter {
    public static void main(String[] args) {

        Example e=new Example();
        Thread t=new Thread(e);

        t.start();
        // t.interrupt();
        
        System.out.println(t.isAlive());
        
    }
    
}
