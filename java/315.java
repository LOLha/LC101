public class S315 {
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
        int dup = 1;
        int leftSum = 0;
        
    }
    LinkedList<Integer> list = new LinkedList<Integer>();
    public List<Integer> countSmaller(int[] nums) {
        
        Node root = null;
        for(int i = nums.length-1;i>=0;i--){
            root = count(root,nums[i],0);
        }
        return list;
        
    }
    public Node count(Node root,int val,int preSum){
        if(root==null){
            list.addFirst(preSum);
            return new Node(val);
        }
        if(root.val==val){
            root.dup++;
            list.addFirst(root.leftSum+preSum);
        }else if(root.val>val){
            root.leftSum++;
            root.left = count(root.left,val,preSum);
        }else{
            root.right = count(root.right,val,root.leftSum+preSum+root.dup);
            
        }
        return root;
    }    
}
