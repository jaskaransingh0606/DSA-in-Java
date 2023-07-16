
import java.util.Scanner;
public class Exception {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=2;
        int values[]={1,2,3,4,5};
        try{                                                              // try block
            int result=num1/num2;
            // int result=values[7];
            System.out.println(result);
        }
        catch(ArithmeticException e)                                       // catch block   
        {
            System.out.println("You cannot divide a number by zero"+e);
        }
        catch(ArrayIndexOutOfBoundsException e)                                       // catch block   
        {
            System.out.println("Array out of bound"+e);
        }
         catch(Throwable e)                                       // catch block   
        {
            System.out.println("Something went wrong"+e);
        }
        finally{
            sc.close();
            System.out.println("This is finally block");
        }
    }
    
}
