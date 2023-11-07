import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        /*
         * . WAP to sort an array in decreasing order using insertion sort
         * 
         * Input Array {3,5,1,6,0}
         * 
         * Output Array: {6, 5, 3, 1, 0}
         */

         int arr1[] = {3,5,1,6,0};

         for(int i=1 ; i< arr1.length ; i++){
            int j=i;
            while(j>0 && arr1[j] > arr1[j-1]){
                int temp = arr1[j];
                arr1[j] = arr1[j-1];
                arr1[j-1] = temp ;

                j--;
            }
         } System.out.println(Arrays.toString(arr1));
    }
}
