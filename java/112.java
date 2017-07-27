public class S112{
    public boolean hasPathSum(TreeNode root, int sum) {
        int sums=0;
         if(root==null) return false;
        if(root.left==null&&root.right==null)
        {
            return root.val==sum;
        }
        return dfs(root.left,sum,root.val)||dfs(root.right,sum,root.val);
    }
    public boolean dfs(TreeNode x,int sum,int sums){
        if(x==null) return false;
        if(x.left==null&&x.right==null)
        {
            return sums+x.val==sum;
        }
        return dfs(x.left,sum,x.val+sums)||dfs(x.right,sum,x.val+sums);
    }
    


}
