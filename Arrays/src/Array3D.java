import java.util.Scanner;

public class Array3D {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[2][2][2];

        for (int i = 0; i < arr.length; i++) {  // block
            for (int j = 0; j < arr[i].length; j++) {  // row
                for (int k = 0; k < arr[i][j].length; k++) { // column

                    System.out.println(" Enter marks of student of school " + (i + 1) + " of class " + (j + 1) +
                            " of student " + (k+1) );
                    arr[i][j][k] = sc.nextInt();
                }

            }
        }

        System.out.println("Student marks are ");
        for (int i = 0; i < arr.length; i++) {  // block
            for (int j = 0; j < arr[i].length; j++) {  // row
                for (int k = 0; k < arr[i][j].length; k++) { // column

                    System.out.print(arr[i][j][k]+" ");

                }
            }
        }


    }
}
