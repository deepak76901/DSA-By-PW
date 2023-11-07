import java.util.Arrays;

public class prefixSum {

    public static void main(String[] args) {

        int n=4;
        int m=4;
        int [][] arr = new int[m][n];

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                arr[i][j] = 1;
            }
        }

        System.out.println("Array is here...");

        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(arr[i][j] + "\t");
            }System.out.println();
        }

        // Total sum of Array
        
        for(int i=0 ; i<arr.length ; i++){
            for(int j=1 ; j<arr[0].length; j++){
                arr[i][j] += arr[i][j];
            }
        }

        System.out.println();
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(arr[i][j] + "\t");
            }System.out.println();
        }
        

        

    }
}
