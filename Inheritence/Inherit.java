// Program to demonstrate Inheritence

class Human{                  // Super class, Parent class, Base class
    int age=20;
    private String name;

    Human(){                                                           //constructors are not inherited

        System.out.println("Human class constructor");
    }
    
    void sleep(){
        System.out.println("Human is sleeping");
        System.out.println(age);
    }
}

class Student extends Human{           //child class, sub class, derived class,extend keyword is used to inherit
    // Student(){                              //default constructor is called automatically
    //     Super();                        //super keyword is used to call parent class constructor
    // }
    
    void display(){
        System.out.println("The age is "+age);
        // System.out.println("The name is "+name);            //private members are not inherited
    }
  
}

public class Inherit {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.display();
        obj.age=20;
        obj.sleep();
        
    }
    
}
