public class RecursiveReversal {

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

    public void reverseList(){
        
    }

    public static void main(String[] args) {
        RecursiveReversal llist = new RecursiveReversal();
        llist.InsertBeg(6);
        llist.InsertBeg(7);
        llist.InsertBeg(8);
        llist.InsertBeg(9);
        llist.printList();

    }

}
