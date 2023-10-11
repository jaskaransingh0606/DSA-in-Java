
import java.util.Scanner;

public class PrefixSumBrute {

    public static int prefixSum(int[][] arr ,int r1,int c1,int r2,int c2){

        int sum = 0;

        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum=sum+arr[i][j];
            }
        }

        return sum;

    }
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates");

        System.out.println("Enter r1");
        int r1 = sc.nextInt();

        System.out.println("Enter c1");
        int c1 = sc.nextInt();

        System.out.println("Enter r2");
        int r2 = sc.nextInt();

        System.out.println("Enter c2");
        int c2 = sc.nextInt();

        int result = prefixSum(arr, r1, c1, r2, c2);

        System.out.println("Sum of submatrix is " + result);

    }

}
