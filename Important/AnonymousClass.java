interface Car { // we caanot create object of interface
    void drive();
}

public class AnonymousClass {
    public static void main(String[] args) {
        // Car obj=new Car(){                                               // Anonymous class
        //     public void drive(){
        //         System.out.println("I am driving");
        //     }
        // };
        // }

         Car obj=()->{                                              // Lambda Expression
            
                System.out.println("I am driving");}
            
        
    }
}
