import java.util.*;
public class List {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(1);
        al1.add(2);
        al1.add("hello");
        System.out.println(al1);

        ArrayList al2=new ArrayList();
        al2.add("pw");
        al2.add(10);
        System.out.println(al2);

        al2.addAll(al1);                 // addAll() method adds all the elements of the specified collection to the end of the list.
        al2.add(2, 34);    // add(index,element) method adds the element at the specified index.
        System.out.println(al2);

        // Accessing data with loops  is not reccomended as it is slow and not work for all collections.

        // for(int i=0;i<al2.size();i++){
        //     System.out.println(al2.get(i));
        // }

        Iterator itr=al2.iterator();    // iterator() method returns an iterator over the elements in this list in proper sequence.

        while(itr.hasNext()){
            Integer i=(Integer)itr.next();
            System.out.println(i);
        }

        // List Iterator works only for list interface.
        ListIterator litr=al2.listIterator(al1.size());   // listIterator() method returns a list iterator over the elements in this list (in proper sequence).

        while(litr.hasPrevious()){
            Integer i=(Integer)litr.previous();
        }
        
    }

   
}
