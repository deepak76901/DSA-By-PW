public class Q3 {
    public static void main(String[] args) {
        // Q3: Write a program to calculate the maximum element in the array.
        // Input 1: arr[] = {34,21,54,65,43}
        // Output 1: 65

        // int arr[] =  {34,21,54,65,43};
        
        // for(int i=0 ; i<arr.length ; i++){
        //     for(int j=i ; j<arr.length-1-i ; j++)
        //     if(arr[j] > arr[j+1]){
        //         int temp = arr[j];
        //         arr[j] = arr[j+1];
        //         arr[j+1] = temp ;
        //     } 
        // }
        // // for(int a:arr){
        // //     System.out.print(a + "\t");
        // // }
        // System.out.println(arr[arr.length-2]);

        int[] arr = { 10, 7, -5, 8, 9, 0, -4,15 };
        // int max = Integer.MIN_VALUE;
        // for (int val : arr) {
        //     max = Math.max(max, val);
        // }
        // System.out.print("Largest in given array is " + max);

        int max = Integer.MIN_VALUE;
        for(int val : arr){
            max = Math.max(max , val);

        }
        System.out.println(max);

    }
}
