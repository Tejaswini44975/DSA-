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

public class Solution {
    public static int length(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
              count++;
              temp=temp.next;
        }
        return count;
    }
}