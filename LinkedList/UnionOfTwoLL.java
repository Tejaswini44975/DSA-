//gfg
/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution
{
	public static Node findUnion(Node head1,Node head2)
	{
	    Set<Integer> set = new TreeSet<>();
	    while(head1!=null)
	    {
	        set.add(head1.data);
	        head1=head1.next;
	    }
	    while(head2!=null)
	    {
	        set.add(head2.data);
	        head2=head2.next;
	    }
	    Node curr=null;
	    Node start=null;
	    for(int x:set)
	    {
	        if(start==null)
	        {
	            start=new Node(x);
	            curr=start;
	        }
	        else
	        {
	            curr.next=new Node(x);
	            curr=curr.next;
	            
	        }
	    }
	    return start;
	}
}
