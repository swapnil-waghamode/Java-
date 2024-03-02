
class Charger{
    private String brand;
    private int ChargeSpeed;

    public Charger(String brand, int ChargeSpeed) {
        this.brand = brand;
        this.ChargeSpeed = ChargeSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getChargeSpeed() {
        return ChargeSpeed;
    }
}


class OS{
    private String name;
    private int bit;

    public OS(String name, int bit) {
        this.name = name;
        this.bit = bit;
    }

    public String getName() {
        return name;
    }

    public int getBit() {
        return bit;
    }
}

class Mobile{

    // composition
    OS os = new OS("Android", 64);

//    Aggregation

     void hasA(Charger c){
         System.out.println("Mobile has "+c.getBrand()+" charger with "+ c.getChargeSpeed()+
                 " watt super fast charge ");
     }
}

public class AggregationComposition {

    public static void main(String[] args) {

        Mobile m = new Mobile();
        System.out.println("Mobile has " +m.os.getName() +"OS  and "+ m.os.getBit()+" bit");
        m.hasA(new Charger("OnePlus", 80));


    }
}
