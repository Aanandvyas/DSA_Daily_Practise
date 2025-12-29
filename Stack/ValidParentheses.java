package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static boolean isValid(String s){
        Deque<Character> dq = new ArrayDeque<>();
        if(s.length() % 2 !=0) return false;

        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                dq.addLast(c);
            }
            else{
                if(dq.isEmpty()) return false;
                char top = dq.peekLast();
                if(c==')' && top=='('){
                    dq.pollLast();
                }
                else if(c=='}' && top=='{'){
                    dq.pollLast();
                }
                else if(c==']' && top== '['){
                    dq.pollLast();
                }
                else{
                    return false;
                }

            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "()";
        System.out.println(isValid(s));
    }
}
