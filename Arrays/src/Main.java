import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       First Array program - 1D array

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array");
        int n = sc.nextInt();

        int []a = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter "+(i+1)+" st element");
            a[i] = sc.nextInt();
        }

        System.out.println("Array elements are ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }


    }
}