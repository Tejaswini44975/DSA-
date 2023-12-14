//gfg

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static class Pair
    {
        Node node;
        int hd;

        Pair(Node node,int hd)
        {
            this.node = node;
            this.hd = hd;
        }
    }
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        ArrayList<Integer> list = new ArrayList<>();
        if(root==null)
        {
            return list;
        }
        Map<Integer,Integer> mp = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root,0));
        while(!q.isEmpty())
        {
            Pair it = q.remove();
            int hd=it.hd;
            Node temp=it.node;
            
            if (!mp.containsKey(hd))
            {
                mp.put(hd, temp.data);
            }

           if(temp.left!=null)
           {
               q.add(new Pair(temp.left,hd-1));
           }
           if(temp.right!=null)
           {
               q.add(new Pair(temp.right,hd+1));
           }
        }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet())
        {
            list.add(entry.getValue());
        }
        return list;
    }
}
