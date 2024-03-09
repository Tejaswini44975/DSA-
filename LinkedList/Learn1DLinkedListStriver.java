/****************************************************************

 Following is the class structure of the Node class:

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

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node insertAtFirst(Node list, int newValue) {
       
        Node node =new Node(newValue);
        if(list==null)
        {
            return node;
        }
        node.next=list;
        list=node;
        return node;
    }
}

//Delete Last Node Of Linked List

public class Solution {
    public static Node deleteLast(Node list){
       if(list==null || list.next==null)
       {
           return null;
       } 
       Node temp=list;
       while(temp.next.next!=null)
       {
           temp=temp.next;
       }
        temp.next=null;
        return list;
    }
}

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
