package GS;

import java.util.*;
import java.io.*;
public class Largest10Numbers {
	static int[] Largest10(int a[]) {
		int result[]=new int[10];
		PriorityQueue<Integer>pq=new PriorityQueue<>(); 
		for(int i=0;i<a.length;i++) {
			if(pq.size()<10) pq.add(a[i]);
			
			else if(pq.peek()<a[i]) {
				pq.poll();
				pq.add(a[i]);
			}
		}
		int i=0;
		while(pq.size()>0) {
			result[i++]=pq.poll();
		}
		return result;
		
	}
}
