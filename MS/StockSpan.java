package MS;
import java.util.*;

public class StockSpan {
	static int[] calculateSpan(int price[], int n)
    {
		int res[]=new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
 
        res[0] = 1;
 
        for (int i = 1; i < n; i++) {
 
            while (!st.empty() && price[st.peek()] <= price[i])
                st.pop();
 
            res[i] = (st.empty()) ? (i + 1) : (i - st.peek());
 
            st.push(i);
        }
        return res;
    }
}
