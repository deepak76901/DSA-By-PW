public class Q5 {
    public static void main(String[] args) {

        // Q5: Given an array. Find the first peak element in the array. A peak element
        // is an element that is greater than
        // its just left and just right neighbor.
        // Input 1: arr[] = {1,3,2,6,5}
        // Output 1: 6

        int arr[] = {1, 4,7,3,2,6,5};
        int val = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                val=arr[i];
                max = Math.max(max,val);
            }
        }
        System.out.println(max);
    }
}
