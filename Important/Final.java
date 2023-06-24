

//  final class Animal{                                            // final class cannot be inherited
//     final void sleep(){
//         System.out.println("Animal is sleeping");
//     }
// }

 class Animal{
//    final int age=10;                                          // final variable cannot be changed

    int age=10;
    final void sleep(){
        System.out.println("Animal is sleeping");
        age=20;
    }
}

class Tiger extends Animal{
    // void sleep(){                                                  final method cannot be overridden
    //     System.out.println("Tiger is sleeping");
    // }
    
}

public class Final {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        t.sleep();
        
    }
    
}
