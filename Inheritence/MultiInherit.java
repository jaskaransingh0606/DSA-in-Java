
 class Demo1{
    void dispaly(){
        System.out.println("Display in Demo1");
    }
}

 class Demo2 extends Demo1{
    
}

    class Demo3 extends Demo2{
        
    }

public class MultiInherit {
    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        obj.dispaly();                                                 //display in Demo1
        
    }
    
}
