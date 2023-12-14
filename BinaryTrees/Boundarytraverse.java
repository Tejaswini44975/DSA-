Following is the Binary Tree node structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 ************************************************************/

import java.util.List;
import java.util.ArrayList;


public class Solution {
    public static List<Integer> traverseBoundary(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
         if(isLeaf(root)==false)
         {
             list.add(root.data);
             leftBoundary(root,list);
             Leaves(root,list);
             rightBoundary(root,list);
         }
         return list;
        
    }
     static boolean isLeaf(TreeNode root)
     {
         return (root.left==null) && (root.right==null);
     }
     static void leftBoundary(TreeNode root, ArrayList<Integer> res)
     {
         TreeNode curr=root.left;
         while(curr!=null)
         {
             if(isLeaf(curr)==false)
             {
                 res.add(curr.data);
             }
             if(curr.left!=null)
             {
                 curr=curr.left;
             }
             else
             {
                 curr=curr.right;
             }
         }
     }
     static void rightBoundary(TreeNode root, ArrayList<Integer> res)
     {
         TreeNode curr=root.right;
         ArrayList<Integer> temp = new ArrayList<>();
         while(curr!=null)
         {
             if(isLeaf(curr)==false)
             {
                 temp.add(curr.data);
             }
             if(curr.right!=null)
             {
                 curr=curr.right;
             }
             else
             {
                 curr=curr.left;
             }
         }
         for(int i=temp.size()-1;i>=0;i--)
         {
             res.add(temp.get(i));
         }
    }

    static void Leaves(TreeNode root, ArrayList<Integer> res)
    {
        if(isLeaf(root))
        {
            res.add(root.data);
            return;
        }
        if(root.left!=null)
        {
            Leaves(root.left,res);
        }
        if(root.right!=null)
        {
            Leaves(root.right,res);
        }
    }

}
