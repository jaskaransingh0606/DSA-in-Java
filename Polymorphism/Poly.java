class Aeroplane {
    public void takeOff() {
        System.out.println("Aeroplane is taking Off");
    }

    public void fly() {
        System.out.println("Aeroplane is flying");
    }
}

class CargoPlane extends Aeroplane {
    public void takeOff() {
        System.out.println("CargoPlane requires longer runway for takeOff");
    }

    public void fly() {
        System.out.println("Cargoplane is flying");
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

class Airport {
    public void common(Aeroplane ref) {                //polymorphic method
        ref.takeOff();
        ref.fly();
    }

}

public class Poly {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();             // upcasting , name of parent class can be used

        PassengerPlane pp = new PassengerPlane();

        FighterPlane fp = new FighterPlane();

        Airport a = new Airport();

        a.common(cp);
        a.common(pp);
        a.common(fp);

        // cp.takeOff();
        // cp.fly();

        // pp.takeOff();
        // pp.fly();

        // fp.takeOff();
        // fp.fly();

    }

}
