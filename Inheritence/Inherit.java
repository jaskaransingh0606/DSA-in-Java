// Program to demonstrate Inheritence

class Human{                  // Super class, Parent class, Base class
    int age;
    void sleep(){
        System.out.println("Human is sleeping");
        System.out.println(age);
    }
}

class Student extends Human{           //child class, sub class, derived class,extend keyword is used to inherit
    
  
}

public class Inherit {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.age=20;
        obj.sleep();
        
    }
    
}
