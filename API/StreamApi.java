import java.util.*;

import java.util.stream.*;

public class StreamApi {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);

        Stream<Integer> stream = list.stream(); // creating stream

        // long count = stream.count();
        // System.out.println(count);

        Stream<Integer> sortedData = stream.sorted();

        sortedData.forEach(n->System.out.println(n)); // printing sorted data


        

    }

}
