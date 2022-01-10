package AZ;


public class DeletemNodesAfternNOdes {
	class Node
	  {
	      int data;
	      Node next;
	      Node(int data)
	      {
	          this.data = data;
	          this.next = null;
	      }
	  }
	static void linkdelete(Node head, int m, int n)
    {

        Node curr = head, t; 
        int c; 

    while (curr!=null) 
    { 
        for (c = 1; c < m && curr != null; c++) 
            curr = curr.next; 

        if (curr == null) 
            return; 

        t = curr.next; 
        for (c = 1; c <= n && t != null; c++) 
        { 
            Node temp = t; 
            t = t.next; 
        } 
        
        curr.next = t; 

        curr = t; 
    }
    }
}
