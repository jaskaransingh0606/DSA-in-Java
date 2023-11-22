// stack using queue
// Time Complexity: push O(n), pop O(1)
// Space Complexity: O(n)

import java.util.*;

public class StackUsingQueue {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    public void add(int data) {
        // move all elements from q1 to q2
        while(!q1.isEmpty()) {
            int ele = q1.poll();
            q2.add(ele);
            
        }

        // push data to q1
        q1.add(data);

        // move all elements from q2 to q1
        while(!q2.isEmpty()) {
            int ele = q2.poll();
            q1.add(ele);
           
        }
    }

    // to delete the top element
   public  int remove (){
    if(q1.isEmpty()){
        System.out.println("Stack is empty");
        System.exit(0);
    }

    int element = q1.peek();
    q1.poll();  
    return element;
    }
    public static void main(String[] args) {
        StackUsingQueue s = new StackUsingQueue();
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);

        System.out.println("Deleted element from stack "+s.remove());

        System.out.println("Deleted element from stack "+s.remove());
         System.out.println("Deleted element from stack "+s.remove());
          System.out.println("Deleted element from stack "+s.remove());
           System.out.println("Deleted element from stack "+s.remove());
        
    }
    
}
