/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

//Function to delete a node without any reference to head pointer.
class Solution
{
    void deleteNode(Node del)
    {
         if(del.next==null)
         {
             return;
         }
             Node nextNode=del.next;
             del.data=nextNode.data;
             del.next=nextNode.next;
    }
}
