public S100{
	  public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null) return true;
        else if(p==null||q==null) return false;
        else if(p.val!=q.val) return false;
        else{ 
            boolean left = isSameTree(p.left,q.left);
            boolean right = isSameTree(p.right,q.right);
            return left&&right;  
    }
	
}
