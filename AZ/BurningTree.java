package AZ;

import java.util.*;

public class BurningTree {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
}
	public int minTime(Node root, int target) 
	   {
	       dfs(root,null,target);
	       ArrayList<Node> visited=new ArrayList<>();
	       Queue<Node> q=new LinkedList<>();
	       q.offer(start);
	       recur(start,visited,0);
	       return ans;
	       
	   }
	   static int ans=0;
	      static Map<Node,Node> map=new HashMap<>();
	       void recur(Node root, ArrayList<Node> visited,int d){
	       if(root==null)return;
	       if(visited.contains(root))return;
	       visited.add(root);
	       ans=Math.max(ans,d);
	       recur(root.left,visited,d+1);
	       recur(root.right,visited,d+1);
	       recur(map.get(root),visited,d+1);
	   }
	   static Node start;
	    void dfs(Node root,Node parent,int x){
	       if(root==null)return;
	       map.put(root,parent);
	       if(root.data==x){
	           start=root;
	       }
	       dfs(root.left,root,x);
	       dfs(root.right,root,x);
	   }
}
