 class Construc1 {
    private String name;
    private int age;

    public Construc1(String name,int age){
        this.name=name;
        this.age=age;
    }
    
         
    public int getAge() 
    {
        return age;
    }
    public String getName()
     {
        return name;
    }


    public void show() {
        System.out.println(age + " " + name);
    }   
}

public class Construc {
    public static void main(String[] args) {
        Construc1 obj = new Construc1 ("Rahul",20);
        String result = obj.getName();
        System.out.println(result);
       
        obj.show();
    }
}
