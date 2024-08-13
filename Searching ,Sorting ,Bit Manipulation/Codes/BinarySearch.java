import java.util.*;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1; 

        while (low <= high) 
        {
            int mid = low + (high - low) / 2; 

            if (arr[mid] == target) {
                return 1;
            } 
            else if (arr[mid] > target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return 0; 
    }

    public static void main(String[] args) {

        int m;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of Array : ");
        m = sc.nextInt();

        int arr[] = new int[m];

        int i;

        System.out.println("enter the elements : ");
        for (i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        int target;
        System.out.print("enter the target: ");
        target = sc.nextInt();

        if (binarySearch(arr, target) == 1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        
    }
}