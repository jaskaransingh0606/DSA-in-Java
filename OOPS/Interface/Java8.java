interface A{
    void show();
    default void config(){
        System.out.println("In config");

    }

    static void abc(){
        System.out.println("In abc");

    }
}
class B implements A{
    public void show(){
        System.out.println("In show");
    }
}



public class Java8 {
    public static void main(String[] args) {
        A.abc();
        B obj=new B();
        obj.config();

        
    }
    
}
