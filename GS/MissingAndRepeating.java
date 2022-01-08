package GS;

import java.io.*;
import java.util.*;
public class MissingAndRepeating {
	void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    int[] findTwoElement(int a[], int n) {
        // code here
        int res[]=new int[2];
        int i=0;
        while(i<n){
            if(a[i]!=a[a[i]-1]){
                int t=a[i];
                a[i]=a[a[i]-1];
                a[a[i]-1]=t;
            }else i++;
        }
        i=0;
        while(i<n){
            if(a[i]!=i+1){
                res[0]=a[i];
                res[1]=i+1;
                break;
            }
        }
        return res;
    }
}
