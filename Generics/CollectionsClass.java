import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {
        ArrayList <Integer> al =new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println(al);

    Collections.reverse(al);
    System.out.println(al);

    Collections.shuffle(al);
    System.out.println(al);

    int index=Collections.binarySearch(al,30);
    System.out.println(index);

    Collections.rotate(al,2);
    }
    
}
