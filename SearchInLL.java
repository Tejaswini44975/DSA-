class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/


public class Solution
{
    public static int searchInLinkedList(Node head, int k)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.data==k)
            {
                return 1;
            }
                temp=temp.next;
            
        }
        if(temp.data==k)
        {
            return 1;
        }
        return 0;
    }
}
