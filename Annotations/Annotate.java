
class Plane{
    public void fly(){
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Plane{

    @Override  // this annotation is used to check if the method is overridden or not
    
    public void fly(){
        System.out.println("CargoPlane is flying");
    }
}

public class Annotate {
    public static void main(String[] args) {
        CargoPlane cp= new CargoPlane();
        cp.fly();
        
    }
    
}
