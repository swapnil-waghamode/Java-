import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        two classes but one class has 3 student and other has 5 student
        int [][] a = new int[2][];

        a[0] = new int[3];
        a[1] = new int[5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                System.out.println("Enter age of student "+ (j+1)+ " class "+ (i+1));

                a[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
        }
    }
}
