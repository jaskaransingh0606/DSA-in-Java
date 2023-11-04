public class MiddleValue {

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
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

    // function to find the middle value of the linked list
    // we are getting the middle value by using two pointers
    // one pointer is moving one step at a time and the other is moving two steps at
    // a time
    // when the fast pointer reaches the end of the list the slow pointer will be at
    // the middle of the list

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public void middle() {
        Node slow = head; //
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("The middle value is " + slow.data);
    }

    public static void main(String[] args) {
        MiddleValue llist = new MiddleValue();
        llist.InsertBeg(6);
        llist.InsertBeg(7);
        llist.InsertBeg(8);
        llist.InsertBeg(9);
        llist.printList();
        System.out.println();
        llist.middle();

    }

}
