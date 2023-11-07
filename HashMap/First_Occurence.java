import java.util.*;
// import java.lang.Integer;
public class First_Occurence {
    public static void main(String[] args) {
        
        String name = "DeepakD";

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0 ; i<name.length() ; i++){
            if(map.containsKey(name.charAt(i))){
                map.put(name.charAt(i) , map.get(name.charAt(i))+1);
            }
            else{
                map.put(name.charAt(i) , 1);
            }
        }

        int result = -1;
        for(int i=0 ; i<name.length() ; i++){
            if(map.get(name.charAt(i)) ==1){
                System.out.println("Present at : " + i);
                result = 1;
                break;
            }
        }
        if(result==-1){
            System.out.println("No such character Found");
        }
    }
}
