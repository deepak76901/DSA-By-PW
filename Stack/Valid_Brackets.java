import java.util.*;

class Valid_Brackets{

    public static boolean isValid(String str){

        char [] chars = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(char ele : chars){
            if(ele == '(' || ele == '[' || ele== '{'){
                stack.push(ele);
                continue;
            }
            else if(stack.empty()){
                return false;
                
            }

            char top = stack.pop();
            if(top == '(' && ele!=')'){
                return false;
            }
            else if(top == '{' && ele!='}'){
                return false;
            }
            else if(top == '[' && ele!=']'){
                return false;
            }
                
        } return (stack.empty()==true);
    }
    public static void main(String[] args) {
        String str = "{[({}[])]]}";
        boolean result  = isValid(str);
        System.out.println(result);
        
        
    }
}