public class S103{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root==null) return res;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        boolean flag = false;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0;i<size;i++){
                TreeNode t = q.poll();
                list.add(t.val);
                if(t.left!=null) q.offer(t.left);
                if(t.right!=null) q.offer(t.right);
                
            }
            if(flag) {
                Collections.reverse(list);
                flag = false;
            }else flag = true;
            
            res.add(list);
            
        }
        
        return res;
    }

}
