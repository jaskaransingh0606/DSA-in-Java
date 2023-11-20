// Valid Parenthesis
// Time Complexity: O(n)
// Space Complexity: O(n)


import java.util.*;
public class ValidParenthesis {

    public static boolean isValid(String str) {
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
                continue;
            }

            else if (stack.empty()) {
                return false;
            }

            char top = stack.pop();

            if (top == '(' && c != ')') {
                return false;
            } else if (top == '[' && c != ']') {
                return false;
            } else if (top == '{' && c != '}') {
                return false;
            }
        }

        return stack.empty();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        System.out.println(isValid(str));

    }

}
