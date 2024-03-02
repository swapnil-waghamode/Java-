import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

            Scanner sc  = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
            System.out.println(c);

            System.out.println("Enter value of n");
            int n = sc.nextInt();
            int []ar = new int[n];
            System.out.println(ar[n+1]);


        }catch (ArithmeticException ae){
            System.out.println("Enter valid input");
        }
        catch (ArrayIndexOutOfBoundsException ai){
            System.out.println("Incorrect printing");
        }
    }
}