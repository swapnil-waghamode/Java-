
class Plane{

    void fly(){
        System.out.println("Plane is flying");
    }
}

class CargoPlane extends Plane{

    @Override
    void fly() {
        System.out.println("Cargo plane flying");
    }

    void carrayCargo(){
        System.out.println("Cargo plane carrying cargo");
    }
}

class PassengerPlane extends Plane{

    @Override
    void fly() {
        System.out.println("Passenger plane is flying");
    }

    void carrayPassenger(){
        System.out.println("Passenger plane carrying passenger");
    }
}


class FighterPlane extends Plane{

    @Override
    void fly() {
        System.out.println("Fighter plane is flying");

    }

    void carrayWeapons(){
        System.out.println("Fighter plane carrying weapons");
    }
}

class Aeroplane{
//    method to achieve code flexibility and loose coupling
    static void permit(Plane ref){
        ref.fly();

    }
}

public class Polymorphism {
    public static void main(String[] args) {
//        tight coupling
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

//        code for code flexibility with less size
        Aeroplane.permit(cp);
        Aeroplane.permit(pp);
        Aeroplane.permit(fp);


//
//        cp.fly();
//        pp.fly();
//        fp.fly();

//        loose  coupling polymorphic without code flexibility and more size

//        Plane ref;
//
//        ref = cp;
//        ref.fly();
//        ((CargoPlane)(ref)).carrayCargo();    // here done down casting to get specialised method
//
//        System.out.println();
//        ref = pp;
//        ref.fly();
//        ((PassengerPlane)(ref)).carrayPassenger(); // here done down casting to get specialised method
//
//        System.out.println();
//        ref = fp;
//        ref.fly();
//        ((FighterPlane)(ref)).carrayWeapons(); // here done down casting to get specialised method
//

    }
}
