import java.util.*;

class ListNode {

  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
    next = null;
  }
}

class Solution {
  static void PrintList(ListNode head) // Function to print the LinkedList
  {
    ListNode curr = head;
    for (; curr != null; curr = curr.next)
      System.out.print(curr.val + "-->");
    System.out.println("null");
  }

  static ListNode InsertatFirst(int value, ListNode head) {

    ListNode newnode = new ListNode(value);

    
    newnode.next = head;


    head = newnode;
    return head;
  }

  public static void main(String args[]) {
    ListNode head = null;
    head = InsertatFirst(40, head);
    head = InsertatFirst(30, head);
    head = InsertatFirst(20, head);
    head = InsertatFirst(10, head);
    System.out.println("LinkedList before inserting 0 at beginning : ");
    PrintList(head);
    head = InsertatFirst(0, head);
    System.out.println("LinkedList after inserting 0 at beginning : ");
    PrintList(head);
  }
}