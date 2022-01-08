package GS;

import java.util.*;
public class NthUglyNumber {
	long getNthUglyNo(int n) {
        // code here
        TreeSet<Long>ts=new TreeSet<>();
        ts.add(1l);
        int i=1;
        while(i++<n){
            long cur=ts.pollFirst();
            ts.add(cur*2);
            ts.add(cur*3);
            ts.add(cur*5);
        }
        return ts.pollFirst();
    }
}
