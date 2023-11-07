// time complexity: O(n)
// space complexity: O(n)
import java.util.*;

public class twoSum {
  public static void main(String[] args){
   
    int[] arr = {2,7,11,15};
    int target = 9;

    // Create a hashmap where key is arr[i] and value is i
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<arr.length; i++){
        map.put(arr[i], i);
    }
    // create a result array to display the index of two numbers
    int result[] = new int[2];

    // if current is equal to the target
    for(int i=0; i<arr.length; i++){
        if(arr[i] == target && map.containsKey(0)){
            result[0] = i;
            result[1] = map.get(0);
            break;
        }

        else if(map.containsKey(target - arr[i])){
            // is the element non-repeatable
            if(map.get(target - arr[i]) > i){
                result[0] = i;
                result[1] = map.get(target - arr[i]);
                break;
            }
        }
    }

    System.out.println("Two Sum index values are: ["+result[0]+","+result[1]+"]");

  }
}
