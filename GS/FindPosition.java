package GS;

public class FindPosition {
	static int findPosition(int n , int m , int k) {
        // code here
        int rem=n-k+1;
        if(m<=rem) return k+m-1;
        else{
            m-=rem;
            if(m%n==0) return n;
            return m%n;
        }
    }
}
