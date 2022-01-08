package GS;


import java.io.*;
import java.util.*;
public class GroupAnagrams {
		
	public List<List<String>> Anagrams(String[] str) {
        // Code here
        List<List<String>>ans=new ArrayList<>();
        HashMap<String,ArrayList<String>>hm=new HashMap<>();
        int n=str.length;
        for(int i=0;i<n;i++){
            char[] current=str[i].toCharArray();
            Arrays.sort(current);
            String sorted=String.valueOf(current);
            if(hm.containsKey(sorted)){
                hm.get(sorted).add(str[i]);
            }else{
                ArrayList<String>al=new ArrayList<>();
                al.add(str[i]);
                hm.put(sorted,al);
            }
        }
        for(String ss:hm.keySet()){
            ans.add(hm.get(ss));
        }
        return ans;
	}
}
