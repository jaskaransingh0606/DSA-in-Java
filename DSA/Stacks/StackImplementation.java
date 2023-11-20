import java.util.*;

public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements into the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // printing the top element of the stack using peek() method
        System.out.println("The stack is: " + stack.peek());

        // Popping elements from the stack
        int x = stack.pop();

        // Printing the popped element
        System.out.println("The popped element is: " + x);

        System.out.println("The stack is: " + stack.peek());

        // Printing the size of the stack
        System.out.println("The size of the stack is: " + stack.size());

       System.out.println(stack.search(20))  ;

    }

}
