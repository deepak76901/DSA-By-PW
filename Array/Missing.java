public class Missing {
    
    public static void main(String[] args) {
        
        int [] arr = {1,2,3,7,6,5};
        int m = arr.length + 1 ;
        int n = arr.length;

        int allSum = m*(m+1)/2;
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum += arr[i];
        }

        int missing_elem = allSum-sum;

        System.out.println(missing_elem);



    }
}
