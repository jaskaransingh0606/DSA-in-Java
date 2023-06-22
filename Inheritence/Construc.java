class Demo1{
      public Demo1(){
        
        //Super();                                                  //Called by default in every constructor
        System.out.println("Parent class Constructor");

    }
     public Demo1(int x,int y){
        System.out.println("Parameterized parent class constructor");

    }
}

class Demo2 extends Demo1{
    
      public Demo2(){
        this(10,20);
        System.out.println("child class Constructor");

    }
     public Demo2(int x,int y){
        System.out.println("Parameterized child class constructor");

    }
}

public class Construc {
    public static void main(String[] args) {
        Demo2 obj=new Demo2();
        
        
    }
}
