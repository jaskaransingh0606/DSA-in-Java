class A{

    public void show(){
        System.out.println("in A show");
    }
    class B{                                                           // Inner class
        public void display(){
            System.out.println("in B display");
        }

    }
}



public class InnerDemo {
    public static void main(String[] args) {

        A obj=new A();
        A.B obj1=obj.new B();                              // Creating object of inner class
        obj.show();
        obj1.display();
        
    }
    
}
