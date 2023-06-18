

class Demo{
    static void disp1(){                                         // static method
        System.out.println("Static method");
    }

    void disp2(){                                                // non-static method
        System.out.println("Non-static method");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Demo obj=new Demo();
        Demo.disp1();   // static method can be called without creating an object of the class
        obj.disp2();    // non-static method can't be called without creating an object of the class
        
    }
    
}
