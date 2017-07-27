public class S199{
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode t = queue.poll();
                if(i==0) res.add(t.val);
                if(t.right!=null){
                    queue.offer(t.right);
                }
                if(t.left!=null){
                    queue.offer(t.left);
                }
                
            }
            
        }
        
        return res;
    }

}
