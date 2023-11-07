import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {

        /*
         * Q2. WAP to sort an array in descending order using selection sort
         * 
         * Input Array {3,5,1,6,0}
         * 
         * Output Array: {6, 5, 3, 1, 0}
         */

         int [] arr = {6, 5, 3, 1, 0};

         for(int i=0 ; i<arr.length ; i++){
            int min_idx = i;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[j] > arr[min_idx] ){
                    min_idx = j;
                }
            }
            if(min_idx != i){
                int temp = arr[i];
                    arr[i] = arr[min_idx];
                    arr[min_idx] = temp;
            }
         } System.out.println(Arrays.toString(arr));
    }
}
