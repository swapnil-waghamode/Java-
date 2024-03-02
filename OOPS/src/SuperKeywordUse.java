
class Customer{

    private int cid;
    private String cNmae;
     private String address;

    public Customer(int cid, String cName , String address){
        this.cid = cid;
        this.cNmae = cName;
        this.address = address;
    }

    public int getCid() {
        return cid;
    }

    public String getcName() {
        return cNmae;
    }

    public String getAddress() {
        return address;
    }
}


class RegularCustomer extends Customer{

    private float discount;

    public RegularCustomer(int cid, String cName , String address , float discount){
        super(cid, cName, address);
        this.discount = discount;
    }

    public float getDiscount(){
        return discount;
    }
}



public class SuperKeywordUse {
    public static void main(String[] args) {

        RegularCustomer rc = new RegularCustomer(
                101, "Raj", "Bangalore", 10.5f);

        System.out.println(rc.getCid() +" "+
                         rc.getcName()+" "+
                         rc.getAddress()+" "+
                         rc.getDiscount());
    }
}
