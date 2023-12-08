class Node
{
    int data;
    Node left, right;
    Node(int data)
   {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Solution
{
    static void postOrderTrav(Node curr, ArrayList < Integer > postOrder) {
        if (curr == null)
            return;

        postOrderTrav(curr.left, postOrder);
        postOrderTrav(curr.right, postOrder);
        postOrder.add(curr.data);
    }
}
