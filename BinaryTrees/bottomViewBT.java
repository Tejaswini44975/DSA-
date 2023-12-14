class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
         if(root==null)
        {
            return list;
        }
        
        Queue<Node> q = new LinkedList<Node>();
        Map<Integer,Integer> mp = new TreeMap<>();
        
        root.hd=0;
        q.add(root);
        
        while(!q.isEmpty())
        {
            Node temp=q.remove();
            int hd=temp.hd;
            mp.put(hd,temp.data);
            
            if(temp.left!=null)
            {
               temp.left.hd=hd-1; 
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                temp.right.hd=hd+1;
                q.add(temp.right);
            }
        }
        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
            list.add(entry.getValue());
        }
        return list;
    }
}
