import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

//        Create array to store ages of student belong to 2 classrooms and 5 student in each classroom

        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[2][5];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
