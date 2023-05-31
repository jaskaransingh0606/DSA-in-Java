
public class Variables {
    int a;  //instance variable
    int b=6;  //instance variable
    public static void main(String[] args) {
        int c=8;  //local variable
        int d=9;  //local variable

        Variables obj=new Variables();
        System .out.println(c);//loacal variable should be initialized before use
        System .out.println(d);//loacal variable should be initialized before use
        System .out.println(obj.a);

        
    }
    
}
