package AZ;

import java.util.Arrays;

public class NutsAndBoltsProblem {
	void matchPairs(char nuts[], char bolts[], int n) {
        // code 
         for(int i = 0; i < n; i++){
           bolts[i] = nuts[i];
       }
       Arrays.sort(nuts);
       Arrays.sort(bolts);
       return ;
    }
}
