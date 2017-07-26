public class S124{
    int max = 0;
    int tmp = 0;
    public  int maxPathSum(TreeNode root){
        if(root==null) return 0;
        max = root.val;
        getMaxPathSum(root);
        return max;
    }
    public int getMaxPathSum(TreeNode node){
        int left = 0;
        int right = 0;
        if(node.left!=null){
            left = getMaxPathSum(node.left);
        }
        if(node.right!=null){
            right = getMaxPathSum(node.right);
        }
        if(left<0){
          left = 0;
        }
        if(right<0){
          right = 0;
        }
        if((tmp=root.val+left+right)>max){
            max = tmp;
        }
        return root.val+Math.max(left,right);
    }

}
