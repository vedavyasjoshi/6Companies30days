package GS;


import java.io.*;
import java.util.*;
public class FunctionEncode {
	String encode(String str)
	{
          //Your code here
          int n=str.length();
          StringBuilder sb=new StringBuilder();
          if(n==1){
              return str+"1";
          } 
          int i=0,j=1;
          int count=1;
          while(i<n){
            while(j<n&&str.charAt(i)==str.charAt(j)){
                count++;
                j++;
            }
            sb.append(str.charAt(i));
            sb.append(count);
            i=j;
            j++;
            count=1;
            
          }
          
          return String.valueOf(sb);
	}
}
