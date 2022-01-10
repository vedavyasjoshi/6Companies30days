package AZ;

public class MaximumProfit {
	static int maxProfit(int k, int n, int a[]) {
        // code here
        
        int t[][] = new int[k + 1][ n + 1];

        for (int i = 0; i <= k; i++)
            t[i][0] = 0;

        for (int j = 0; j <= n; j++)
            t[0][j] = 0;
        for (int i = 1; i <= k; i++) 
        {
            int c = Integer.MIN_VALUE;
            for (int j = 1; j < n; j++) 
            {
                c = Math.max(c, 
                           t[i - 1][j - 1] - 
                           a[j - 1]);
                t[i][j] = Math.max(t[i][j - 1], 
                               a[j] + c);
            }
        }

        return t[k][n - 1];
    }
}
