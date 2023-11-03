public class InsertAfter {

    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }   
    }
    Node head;

    public void InsertBeg(int newData) {
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void InsertAfterNode(int data,int newData){
        Node prev=head;
        Node newNode= new Node(newData);
        while(prev.data!=data){
            prev=prev.next;
        }

        newNode.next=prev.next;
        prev.next=newNode;

    }

    public void deleteNode(int position){

        // check if list is empty then return as there is nothing to delete
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node temp=head;

        // if we have to delete at the beginning

        if(position==0){
            head=temp.next;
            return;
        }
        else{
             for(int i=1;temp!=null && i<position;i++){
            temp=temp.next;
        }

        if(temp==null || temp.next==null){
            System.out.println("Position is greater than the size of the list");
            return;
        }
        else{
            temp.next=temp.next.next;
        }

        }

       
    }

    public void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        InsertAfter llist = new InsertAfter();
        llist.InsertBeg(6);
        llist.InsertBeg(7);
        llist.InsertBeg(8);
        llist.InsertBeg(9);
        llist.printList();
        System.out.println();
        llist.InsertAfterNode(7, 10);
        llist.printList();

        llist.deleteNode(2);
        System.out.println();
        llist.printList();

       
        
    }
    
}
