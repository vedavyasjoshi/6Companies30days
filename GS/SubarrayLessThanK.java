package GS;

public class SubarrayLessThanK {
	static public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        int i=0,j=0,ans=0;
        long p=1;
        while(j<n){
            p*=a[j];
            while(p>=k&&i<j){
                p/=a[i++];
            }
            if(p<k)
            ans+=(j-i+1);
            j++;
            
        }
        return ans;
    }
}
