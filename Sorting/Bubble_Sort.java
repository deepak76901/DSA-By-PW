import java.util.Arrays;

public class Bubble_Sort{

    public static void sorting(int [] arr){

        for(int i = 0; i<arr.length ; i++){
            boolean swapped = false ;
            for(int j = 0 ; j<arr.length -1 -i ; j++){
                if(arr[j] > arr[j+1] ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;

                    swapped = true;
                } 
            }if(!swapped){
            break;
            }
        } 
    }
    public static void main (String [] args){

        int []arr = {25,14,23,15,26,76,10,3,35,9};
        sorting(arr);

        System.out.println("Sorted array is here : ");
        System.out.println(Arrays.toString(arr));
        

    }
}