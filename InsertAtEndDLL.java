class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node insertAtTail(Node list, int K) {
        Node node = new Node(K);
        Node temp=list;
        if(list==null)
        {
            list=node;
            return list;
        }
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.next=null;
        node.prev=temp;
        temp=node;
        return list;
    }
}
