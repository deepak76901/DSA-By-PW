public class Reversal {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6,7};
        int n=arr.length;
        int temp;
        for(int i=0 ; i<n/2 ; i++){
            temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;


        }
        for(int a : arr){
            System.out.println(a);
        }
    }
}
