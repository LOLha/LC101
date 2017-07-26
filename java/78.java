public class S78{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i<(1<<n);i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j = 0;j<n;j++){
                if((1<<j)&i!=0){
                  list.add(nums[j]);
                }
            }
            res.add(list);
        }
    
    
    }


}
