
import java.util.Scanner;

public class LaunchMulti1 {
    public static void main(String[] args) {
        System.out.println("Calculation task started");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();

        int res = num1 + num2;
        System.out.println("The result is: " + res);
        System.out.println("Calculation task completed");

        System.out.println("Displaying important message");

        for (int i = 0; i <= 3; i++) {
            System.out.println("Focus is important to master skills");

        }
        System.out.println("Displaying import message task ended");

    }

}
