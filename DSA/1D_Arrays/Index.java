
import java.util.Scanner;

class Num {
    public int position(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                index = i;
            }
        }
        return index;
    }
}

public class Index {
    public static void main(String[] args) {
        System.out.println("Enter the number to know its index");

        int[] nums = { 1, 2, 3, 4, 5 };
        // System.out.println("Enter the number to know its index");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        input.close();
        Num obj = new Num();
        int result = obj.position(nums, target);
        System.out.println("The index of the number is " + result);

    }

}