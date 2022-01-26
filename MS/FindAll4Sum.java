package MS;
import java.util.*;
public class FindAll4Sum {
	public ArrayList<ArrayList<Integer>> fourSum(int[] a, int k) {
        int n = a.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        if (n < 4) return ans;

        Arrays.sort(a);
        for (int i = 0; i < n - 3; i++) {
            if (a[i] > 0 && a[i] > k) break;

            if (i > 0 && a[i] == a[i - 1]) continue;

            for (int j = i + 1; j < n - 2; ++j) {
                if (j > i + 1 && a[j] == a[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int old_l = left;
                    int old_r = right;
                    int sum = a[i] + a[j] + a[left] + a[right];
                    if (sum == k) {
                        ans.add(new ArrayList<Integer>(
                            Arrays.asList(a[i], a[j], a[left], a[right])));

                        while (left < right && a[left] == a[old_l]) left++;
                        while (left < right && a[right] == a[old_r]) right--;
                    } else if (sum > k) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return ans;
}
