package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LearningStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.add(2);
        st.add(24);
        st.add(9);
        st.add(8);
        st.add(44);
        for(int i=st.size();i>0;i--){
            st2.add(st.pop());
        }
        

        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(5);
        dq.push(21);
        dq.push(16);
        dq.push(9);
        dq.add(23);
        System.out.println(dq);

        dq.remove();
        System.out.println(dq.peek());
    }
}
