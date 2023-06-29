interface Computer{
     void compileCode();
        
    
}


class Laptop implements Computer{
    public void compileCode(){
        System.out.println("You got 5 errors");
    }
}

class Desktop implements Computer{
    public void compileCode(){
        System.out.println("You got 5 errors,faster than laptop");
    }
}





class Developer{
    public void buildApp(Computer obj){
        System.out.println("App is building");
        
        obj.compileCode();

    }
}

public class Main {
    public static void main(String[] args) {
        Computer obj=new Laptop();
        Computer obj1=new Desktop();

        Developer dev=new Developer();
        dev.buildApp(obj);
        
    }
    
}
