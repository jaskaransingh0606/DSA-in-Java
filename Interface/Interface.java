
// // Interface can extend multiple interfaces but can't extend any class


// interface A{
//     int num=6;                //By default it will be public,static and final

//     void show();             //By default method will be public and abstract
// }

// interface B{
//     void abc();
// }

// class X implements A,B{                                   //Multiple inheritance
//     public void show(){
//         System.out.println("In A show");
//     }
//     public void abc(){
//         System.out.println("In B abc");
//     }
// }



// public class Interface {
//     public static void main(String[] args) {

//         System.out.println(A.num);                 // bcoz by default it was num
//         X obj=new X();
//         obj.show();
//         obj.abc();
        
//     }
    
// }
 interface A{
    default String m1(){
        return "a";
    }
 }

