import java.util.HashMap;
import java.util.*;

public class Two_Sum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        int target = 9;

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0 ; i<arr.length ; i++){
            map.put(arr[i] , i);
        }
        System.out.println(map);

        int [] result = new int [2];
        
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i]==target && map.containsKey(0) ){
                result[0] = i;
                result[1] = map.get(0);
                break;
            }

            else if (map.containsKey(target - arr[i])){
                if(map.get(target - arr[i] ) >i){
                    result[0] = i;
                    result[1] = map.get(target - arr[i]);
                    break;
                }
            }
        }
        System.out.println("The indexes of 2 Numbers is : " + Arrays.toString(result));

    }
    
}
