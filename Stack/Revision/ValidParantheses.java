package Stack.Revision;

import java.util.Deque;
import java.util.ArrayDeque;

public class ValidParantheses {
    public static boolean isValid(String s){
        Deque<Character> dq = new ArrayDeque<>();
        if(s.length() %2 !=0) return false;
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                dq.addLast(c);
            }
            else{
                char top = dq.peekLast();

                if(dq.isEmpty()){
                    return false;
                }

                if(c==')' && top=='('){
                    dq.removeLast();
                }
                else if(c==']' && top == '['){
                    dq.removeLast();
                }
                else if(c=='}' && top == '{'){
                    dq.removeLast();
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "([)]";
        System.out.println(isValid(s));
    }
}
