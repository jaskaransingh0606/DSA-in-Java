
public class InsertAtEnd {

    // Create a Node class which has data and next pointer
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }

    }

    Node head;

    public void InsertEnd(int newData) {
        Node newNode = new Node(newData);

        // If the Linked List is empty, then make the new node as head

        if (head == null) {
            head = newNode;
            return;
        }

        // Else traverse till the last node

        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Change the next of last node

        temp.next = newNode;
        return;
    }

    // Print the Linked List

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        InsertAtEnd llist = new InsertAtEnd();
        llist.InsertEnd(6);
        llist.InsertEnd(7);
        llist.InsertEnd(8);
        llist.InsertEnd(9);
        System.out.println("Linked List created");
        llist.printList();
        llist.InsertEnd(1);
        System.out.println("\nLinked List after insertion");
        llist.printList();

    }

}
