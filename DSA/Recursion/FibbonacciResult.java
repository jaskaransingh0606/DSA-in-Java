
import java.util.Scanner;

public class FibbonacciResult {

    public static int fib(int n){
        int result=0;
        if(n==0 || n==1){
            return n;
        }
        else{
            result = fib(n-1) + fib(n-2);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();

        int result=fib(n);
        System.out.println("Fibbonacci of "+n+" is "+result);
        
    }
    
}
