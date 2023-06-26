interface Demo{
    int num=6;                //By default it will be public,static and final

    void show();             //By default method will be public and abstract
}



public class Interface {
    public static void main(String[] args) {

        System.out.println(Demo.num);                 // bcoz by default it was num
        
    }
    
}
