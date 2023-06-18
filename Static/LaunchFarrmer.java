
import java.util.Scanner;


class Farmer{
    int principal;
   static float rate;  // static variable allocates memory only once and is shared by all the objects of the class.
    float time;
    float simpleInterest;

    static{
        rate=4.5f;

    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        principal = sc.nextInt();
        System.out.println("Enter the time period");
        time = sc.nextInt();
        
        
    }

    void compute(){
        simpleInterest = (principal*rate*time)/100;
    }

    void dispaly(){
        System.out.println("The simple interest is "+simpleInterest);
    }

}

public class LaunchFarrmer {
    public static void main(String[] args) {

        Farmer obj1=new Farmer();
        Farmer obj2=new Farmer();
        obj1.input();
        obj1.compute();
        obj1.dispaly();
        obj2.input();
        obj2.compute();
        obj2.dispaly();
        
    }
    
}
