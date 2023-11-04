public class CycleDetection {

    class Node {
        int data;
        Node next;

        Node(int newData) {
            data = newData;
            next = null;
        }
    }

    Node head;

    public void InsertBeg(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Floyd's Cycle Detection Algorithm
    // here we use two pointers slow and fast
    // slow moves one step at a time and fast moves two steps at a time
    // if there is a cycle then they will meet at some point
    // if there is no cycle then fast will reach null
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public void detectCycle() {
        Node slow = head;
        Node fast = head;
        int flag = 0;

        while (fast != null && fast.next != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                flag = 1;
                break;
            }

        }

        if (flag == 0) {
            System.out.println("No cycle detected");
        } else {
            System.out.println("Cycle detected");
        }

    }

    public static void main(String[] args) {
        CycleDetection llist = new CycleDetection();
        llist.InsertBeg(6);
        llist.InsertBeg(7);
        llist.InsertBeg(8);
        llist.InsertBeg(9);
        llist.printList();

        Node temp = llist.head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = llist.head;
        
        llist.detectCycle();

    }

}
