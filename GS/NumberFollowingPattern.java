package GS;

import java.util.*;
public class NumberFollowingPattern {
	static String printMinNumberForPattern(String S){
        // code here
        String ans = "";
        Stack<Integer> st = new Stack<Integer>();
 
        for (int i = 0; i <= S.length(); i++) {

            st.push(i + 1);

            if (i == S.length() || S.charAt(i) == 'I') {

                while (!st.empty()) {

                    ans += String.valueOf(st.peek());
                    st.pop();
                }
            }
        }
 
        return ans;
	}
}
