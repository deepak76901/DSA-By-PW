import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        
        int m = 3;
        int n= 4;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the array element");
        int [][] arr = new int[m][n];
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array is here");
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(arr[i][j] + "\t");
            }System.out.println();
        }

        int num = Integer.MIN_VALUE;
        int max =0;
        int val=0;
        for(int i=0 ; i<m ;i++){
            for(int j=0 ; j<n ; j++){
                val = arr[i][j];
                max = Math.max(max , val);
            }
        }
        System.out.println("Maximum number is : " + max);
    }
}
