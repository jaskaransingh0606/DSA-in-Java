// Program to demonstrate the concept of abstraction


abstract class Aeroplane {                                    // abstract class
    abstract public void takeOff();                           //class with no body is abstract class
    
    

   abstract public void fly();

   public void landing() {
       System.out.println("Aeroplane is landing");
   }
     
    
}

class CargoPlane extends Aeroplane {
    public void takeOff() {
        System.out.println("CargoPlane requires longer runway for takeOff");
    }

    public void fly() {
        System.out.println("Cargoplane is flying");
    }

    public void alert() {
        System.out.println("Alert:");
    }

}

class PassengerPlane extends Aeroplane {
    public void takeOff() {
        System.out.println("PassengerPlane requires medium runway for takeoff");
    }

    public void fly() {
        System.out.println("Passenger plane is flying");
    }
}

class FighterPlane extends Aeroplane {
    public void takeOff() {
        System.out.println("FighterPlane requires small runway for takeoff");
    }

    public void fly() {
        System.out.println("Passenger plane is flying");
    }
}

public class Abstract {
    public static void main(String[] args) {

        Aeroplane ref1=new CargoPlane();
        ref1.takeOff();
        ref1.fly();
        ref1.landing();
        ((CargoPlane)ref1).alert();                  //downcasting
        
    }
    
}
