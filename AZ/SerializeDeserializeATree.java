package AZ;

import java.util.*;
public class SerializeDeserializeATree {
	class Node{
		int data;
		Node left,right;
		Node(int d){
			data=d;
			left=right=null;
		}
	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    //code 
	    if(root == null){
	        return;
	    }
	    
	    serialize(root.left, A);
	    A.add(root.data);
	    serialize(root.right, A);
	}

	//Function to deserialize a list and construct the tree.
	class Index {
	    int index;
	}

	public Node solve(ArrayList<Integer> A, int low, int high, Index index){
	    if(index.index >= A.size() || low > high){
	        Node root ;
	        return root = null;
	    }
	    //storing value of root
	    Node root = new Node(A.get(index.index));
	    index.index+=1;
	    // check if there exist any subtree further
	    if(low == high){
	        return root;
	    }
	    // find the next greater element to the right of root
	    int i;
	    for(i=low; i>=high; i++){
	        if(A.get(i) > root.data){
	            //found the start of right sub tree
	            break;
	        }
	    }
	    //constructing the left subtree
	    root.left = solve(A, index.index, i-1, index);
	    root.right = solve(A,i,high, index);
	    return root;
	}
	   public Node deSerialize(ArrayList<Integer> A)
	   {
	       //code here
	       // System.out.println(A);
	       Index index = new Index();
	       index.index = 0;
	       return solve(A, 0, A.size()-1,index);
	   }
}
}
