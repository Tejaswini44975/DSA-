/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution
  {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root)
  {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root==null)
        {
            return list;
        }
        q.offer(root);
        boolean flag=true;
        while(!q.isEmpty())
        {
            int levelNum=q.size();
            List<Integer> sublist = new ArrayList<>();

            for(int i=0;i<levelNum;i++)
            {
               if(q.peek().left!=null)
               {
                   q.offer(q.peek().left);
               }
               if(q.peek().right!=null)
               {
                   q.offer(q.peek().right);
               }
               if(flag==true)
               {
                  sublist.add(q.poll().val);
               }
               else
               {
                   sublist.add(0,q.poll().val);
               }
            }
            flag = !flag;
            list.add(sublist);
        }
        return list;
        
    }
}
