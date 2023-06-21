class Aeroplane{
    public void takeOff(){
        System.out.println("Aeroplane is taking Off");
    }
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane extends Aeroplane{
    public void fly(){                                                  //Overriding method
        System.out.println("Cargoplane is flying");
    }
    public void carryGoods(){                                           //Specialized method
        System.out.println("Cargo Plane carries Goods");
    }
}

class PassengerPlane extends Aeroplane{
    public void fly(){                                                    //Overriding method
        System.out.println("Passenger plane is flying");
    }
    public void carryPassengers(){                                       //Specialized method
        System.out.println("Passenger palne carries passengers");
    }

}

public class InheritMethodTypes {
    public static void main(String[] args) {
        CargoPlane cargo=new CargoPlane();
        PassengerPlane passenger=new PassengerPlane();
        cargo.fly();
        passenger.fly();
        cargo.carryGoods();
        
    }
    
}
