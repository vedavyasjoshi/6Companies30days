package GS;

public class MinimumSizeSubarraySum {
	static public int minSubArrayLen(int t, int[] a) {
        int i=0,j=0;
        int sum=0,ans=Integer.MAX_VALUE;
        while(j<a.length){
            sum+=a[j];
            if(sum<t) j++;
            else{
                ans=Math.min(ans,j-i+1);
                while(sum>=t){
                    ans=Math.min(ans,j-i+1);
                    sum-=a[i++];
                }
                j++;
            }
        }
        if(ans==Integer.MAX_VALUE) ans=0;
        return ans;
    }
}
