import java.util.*;

class Gen1<T> {
    T obj;

    public Gen1(T obj) {
        this.obj = obj;
    }

    void disp() {
        System.out.println(obj.getClass().getName());
    }

    public T getObj() {
        return obj;

    }
}

public class Gen{
    public static void main(String[] args) {

        Gen1<Integer> g=new Gen1<Integer>(10);

        g.disp();
        System.out.println(g.getObj());
        // ArrayList<String> list = new ArrayList<String>();

        // ArrayList<int> list2 = new ArrayList<int>();  // error

    }
}