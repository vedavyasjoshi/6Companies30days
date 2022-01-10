package AZ;

import java.util.*;
public class IPL2021MatchDay2 {
	static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        TreeMap<Integer , Integer> hm = new TreeMap<>();
        
        for(int i = 0; i< k-1 ; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i] , hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i] , 1);
            }
        }
        
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = k-1 ; i< n; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i] , hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i] , 1);
            }
            al.add(hm.lastKey());
            
            int num = arr[i - k +1];
            
            if(hm.get(num) > 1){
                hm.put(num , hm.get(num) -1);
            }
            else{
                hm.remove(num);
            }
            
        }    
        
        return al;
        
    }
}
