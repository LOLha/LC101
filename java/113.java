public class S113 {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    List<Integer> list = new ArrayList<Integer>();
    int num = 0;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
         
            findPath(root,sum);
            return res;
    }
    public void findPath(TreeNode root,int sum){
        if(root!=null){
            num += root.val;
            list.add(root.val);
            if(root.left==null&&root.right==null&&num==sum){
                res.add(new ArrayList<Integer>(list));
            }
            
            if(root.left!=null){
                findPath(root.left,sum);
            }
            if(root.right!=null){
                findPath(root.right,sum);
            }
            num -= root.val;
            list.remove(list.size()-1);
        }
    }
    
    
}
