public class IterativeReversal {

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

    public void reverseList() {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void main(String[] args) {
        IterativeReversal llist = new IterativeReversal();
        llist.InsertBeg(6);
        llist.InsertBeg(7);
        llist.InsertBeg(8);
        llist.InsertBeg(9);
        llist.printList();
        llist.reverseList();
        System.out.println();
        llist.printList();
    }

}
