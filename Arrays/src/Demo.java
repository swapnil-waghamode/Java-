import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int []arr = new int[n];

        // 7

        /// 6 7 1 3 8 2 4




        for(int i=0; i< n ;i++){
            arr[i] = sc.nextInt();
        }

        int []maxVal = new int[n];


         maxVal[0] = arr[0];
         maxVal[1] = Math.max(arr[0],arr[1]);
        for(int i=2 ; i< n;i++){

             maxVal[i] = Math.max(maxVal[i-1],maxVal[i-2]+arr[i]);
        }

        System.out.println(maxVal[n-1]);
    }
}
