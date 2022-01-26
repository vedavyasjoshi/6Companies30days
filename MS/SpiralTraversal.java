package MS;
import java.util.*;

public class SpiralTraversal {
	static ArrayList<Integer> spiralPrint(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;
        ArrayList<Integer>al=new ArrayList<Integer>();
        while (k < m && l < n) {
            for (i = l; i < n; ++i) {
                al.add(a[k][i]);
            }
            k++;
 
            for (i = k; i < m; ++i) {
                al.add(a[i][n - 1]);
            }
            n--;
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                	al.add(a[m - 1][i]);
                }
                m--;
            }
 
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                	al.add(a[i][l]);
                }
                l++;
            }
        }
        return al;
    }
}
