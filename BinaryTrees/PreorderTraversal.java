class Node 
{
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
    Node() 
  {

  }
}

public class Solution
  {
    static void preOrderTrav(Node curr, ArrayList < Integer > preOrder) {
        if (curr == null)
            return;

        preOrder.add(curr.data);
        preOrderTrav(curr.left, preOrder);
        preOrderTrav(curr.right, preOrder);
    }
}
