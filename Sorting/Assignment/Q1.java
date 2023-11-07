import java.util.Arrays;

class Q1 {

    public static int[] sorting(int arr[]){

        int n=arr.length;

        for(int j = 0 ; j<n-1 ; j++){
            for(int i=0 ; i<n-1 ; i++){
                if(arr[i+1] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    } 
    public static void main(String[] args) {

        /*
         * Q1. Write a program to sort an array in descending order using bubble sort.
         * 
         * Input Array {3,5,1,6,0}
         * 
         * Output Array: {6, 5, 3, 1, 0}
         */

         int arr[] = {3,5,1,6,0};

         int result[] = sorting(arr); 
         System.out.println(Arrays.toString(result));

    }
}