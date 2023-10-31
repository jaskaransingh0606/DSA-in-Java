
import java.util.Scanner;
public class NumberOfWays {
    public static void main(String[] args) {
        System.out.println("Enter number of stairs");

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int num=numberOfWays(n);
        System.out.println(num);

    }

    public static int numberOfWays(int n){
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else{
            return numberOfWays(n-1)+numberOfWays(n-2);
        }
    }
    
}
