// Implement Queue using Stack
// time complexity of enqueue: O(1)
// time complexity of dequeue: O(n)
// space complexity: O(n) 

import java.util.Stack;

public class QueueUsingStack {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        int ele;
        if (s1.isEmpty() && s2.isEmpty()) {
            System.out.println("Queue is empty");
            System.exit(0);
        }

        // Push all elements from s1 to s2
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                ele = s1.pop();
                s2.push(ele);
            }
        }
        // Pop element from s2
        ele = s2.pop();
        
        return ele;

    }

    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        int res = q.dequeue();
        System.out.println("Deleted element is " + res);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.dequeue();
        res = q.dequeue();
        System.out.println("Deleted element is " + res);

    }

}
