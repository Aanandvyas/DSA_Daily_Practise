package Stack;

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
        System.out.println(st2);
    }
}
