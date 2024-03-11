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

        if(list==null)
        {
            return node;
        }
        
        Node temp=list;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;

        return list;
    }
}

public class Solution
{
    public static Node deleteLastNode(Node head) {
        if(head==null || head.next==null)
        {
            return null;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        Node newTail=temp.prev;
        newTail.next=null;
        temp.prev=null;
        return head;
    }
}



