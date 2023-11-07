public class Duplicate {
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,4,5,5};
        int n = arr.length;
        System.out.println(n);

        for(int i = 0 ; i<n ; i++){
            for(int j=i+1 ; j<n ; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    
                }
            }
        }
    }
}
