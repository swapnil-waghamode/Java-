
public class MethodOverloading {

    String customerName;
    char gender;
    long mobileNo;
    int customerId;

    public void setDetails(String cName){
        customerName = cName;
    }

    public void setDetails(char gen){
        gender = gen;
    }

    public void setDetails(long mb){
        mobileNo = mb;
    }

    public void setDetails(int ci){
        customerId = ci;
    }




    public static void main(String[] args) {

        MethodOverloading m = new MethodOverloading();
        m.setDetails("Roshan");
        m.setDetails('M');
        m.setDetails(8578499330l);
        m.setDetails(2302);

        System.out.println(m.customerName +" "+
                           m.customerId +" "+
                           m.mobileNo+" "+
                           m.gender);

    }
}