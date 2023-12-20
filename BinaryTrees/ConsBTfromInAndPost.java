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
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) 
    {
        if(inorder==null || postorder==null || inorder.length!=postorder.length)
        {
            return null;
        }
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            mp.put(inorder[i],i);
        }

        return buildPostTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mp);
    }
    private TreeNode buildPostTree(int[] inorder,int is,int ie,int[] postorder,int ps,int pe,HashMap<Integer,Integer> mp)
    {
        if(ps>pe || is>ie)
        {
            return null;
        }

        TreeNode root = new TreeNode(postorder[pe]);

        int inRoot=mp.get(postorder[pe]);
        int numslength=inRoot-is;

        root.left=buildPostTree(inorder,is,inRoot-1,postorder,ps,ps+numslength-1,mp);

        root.right=buildPostTree(inorder,inRoot+1,ie,postorder,ps+numslength,pe-1,mp);
        return root;
    }

}
