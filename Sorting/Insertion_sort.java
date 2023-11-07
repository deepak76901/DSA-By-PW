import java.util.*;
public class Insertion_sort {
    public static void main(String[] args) {

        int arr [] = {12,2,5,34,26,15,23,10};

        for(int i=1 ; i<arr.length ; i++){
            int j=i;
            while(j>0 && arr[j] < arr[j-1]){
                int swap = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = swap;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
