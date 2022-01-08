package GS;

import java.util.*;
public class ArrayPairSumDivisibility {
	public boolean canPair(int[] a, int k) {
        // Code here
        if(a.length%2!=0) return false;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
            int p=((a[i]%k)+k)%k;
            if(!hm.containsKey(p)) hm.put(p,1);
            else
            hm.put(p,hm.get(p)+1);
        }
        for (int i=0;i<a.length;i++) {
            int p=((a[i]%k)+k)%k;
            if (2*p==k){
                if(hm.get(p)%2==1)
                    return false;
            }

            else if(p==0){
                if(hm.get(p)%2==1)
                    return false;
            }

            else {
                if(hm.get(k-p)!=hm.get(p))
                    return false;
            }
        }
        return true;
    }
}
