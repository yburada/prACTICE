package leetcode;

import java.util.Stack;

public class paranthsys3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =")()())()()(";
		Stack<Integer> st=new Stack<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++){
        	System.out.println(st);
            char c = s.charAt(i);
            
            if(c=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    int len = i - st.peek();
                    max = Math.max(max,len);
                    System.out.println(max);
                }
            }
        }
        System.out.println(st);
        System.out.println(max);

	}

}
