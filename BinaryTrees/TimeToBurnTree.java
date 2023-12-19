//codingninjas

/**********************************************************	
	
	Following is the representation of Binary Tree Node:
 	
 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}

*********************************************************/

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
public class Solution
{
public static int timeToBurnTree(BinaryTreeNode<Integer> root, int start)
    {
        HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> mpp=new HashMap<>();
        BinaryTreeNode<Integer> target = bfsToMapParents(root,mpp,start);
		int maxi = findMaxDistance(target,mpp);
		return maxi;
    }
	public static BinaryTreeNode<Integer> bfsToMapParents(BinaryTreeNode<Integer> root, HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> mpp, int start)
	{
		Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
		q.offer(root);
		BinaryTreeNode<Integer> res = new BinaryTreeNode<>(-1);

		while(!q.isEmpty())
		{
			BinaryTreeNode<Integer> node = q.poll();
			if(node.data==start)
			{
				res=node;
			}
			if(node.left!=null)
			{
				mpp.put(node.left,node);
				q.offer(node.left);
			}
			if(node.right!=null)
			{
				mpp.put(node.right,node);
				q.offer(node.right);
			}
		}
		return res;
	}
		private static int findMaxDistance(BinaryTreeNode<Integer> target ,  HashMap<BinaryTreeNode<Integer>,BinaryTreeNode<Integer>> mpp)
		{
              Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
			  q.offer(target);

			  HashMap<BinaryTreeNode<Integer>,Integer> vis = new HashMap<>();
			  vis.put(target,1);
			  int maxi=0;

			  while(!q.isEmpty())
			  {
				  int size=q.size();
				  int fl=0;

				  for(int i=0;i<size;i++)
				  {
					  BinaryTreeNode<Integer> node = q.poll();
                      if(node.left!=null && vis.get(node.left)==null)
					  {
						  fl=1;
						  vis.put(node.left,1);
						  q.offer(node.left);
					  }
					  if(node.right!=null && vis.get(node.right)==null)
					  {
						  fl=1;
						  vis.put(node.right,1);
						  q.offer(node.right);
					  }
					  if(mpp.get(node)!=null && vis.get(mpp.get(node))==null)
					  {
						  fl=1;
						  vis.put(mpp.get(node),1);
						  q.offer(mpp.get(node));

					  }
				  }
				  if(fl==1)
				  {
					  maxi++;
				  }
			  }
			  return maxi;
		}
	
}
