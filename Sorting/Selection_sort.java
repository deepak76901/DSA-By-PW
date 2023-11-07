import java.util.*;
public class Selection_sort{
    public static void main(String[] args) {
        
        int []ar = {25,14,23,15,20,35,9};

        for(int i=0 ; i<ar.length ; i++){
            int min_idx = i;

            for(int j=i+1 ; j<ar.length ; j++ ){
                if(ar[j] < ar[min_idx]){
                    min_idx = j;
                }
            }
            if(min_idx != i){
                int temp = ar[i];
                ar[i] = ar[min_idx];
                ar[min_idx] = temp;
            }
        }
        System.out.println(Arrays.toString(ar));

    }
}