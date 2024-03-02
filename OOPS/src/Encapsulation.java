
public class Encapsulation {

   private long balance;

   public void setBalance(long amt){
       if(amt >= 0){
           balance = amt;
       }else{
           System.out.println("Invalid amount");
           System.exit(0);
       }
   }

   public long getBalance(){
       return balance;
   }

    public static void main(String[] args) {

       Encapsulation e = new Encapsulation();
       e.setBalance(-100000);
       System.out.println(e.getBalance());

    }
}
