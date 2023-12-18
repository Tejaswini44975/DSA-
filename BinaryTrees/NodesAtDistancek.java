class Solution {
    private void markParents(TreeNode root, Map<TreeNode,TreeNode> mp, TreeNode target)
    {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty())
        {
            TreeNode current = q.poll();
            if(current.left!=null)
            {
                mp.put(current.left,current);
                q.offer(current.left);
            } 
            if(current.right!=null)
            {
                mp.put(current.right,current);
                q.offer(current.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> mp=new HashMap<>();
        markParents(root,mp,target);
        Map<TreeNode, Boolean> visited=new HashMap<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(target);
        visited.put(target,true);
        int dis=0;
        while(!q.isEmpty())
        {
            int size=q.size();
            if(dis==k)
            {
                break;
            }
            dis++;
            for(int i=0;i<size;i++)
            {
                TreeNode current=q.poll();

                 if(current != null) 
                 {
                if(current.left!=null && visited.get(current.left)==null)
                {
                    q.offer(current.left);
                    visited.put(current.left,true);
                }

                if(current.right!=null && visited.get(current.right)==null)
                {
                    q.offer(current.right);
                    visited.put(current.right,true);
                }

                if(current!=null && visited.get(mp.get(current))==null)
                {
                    q.offer(mp.get(current));
                    visited.put(mp.get(current),true);
                }
                 }
            }
        }
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty())
        {
            TreeNode curr=q.poll();
            list.add(curr.val);
        }
        return list;
    }
}
