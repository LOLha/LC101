public class S162 {
    public int findPeakElement(int[] nums) {
        int i  =0;
        int j = nums.length - 1;
        while(i<j){
            int mid1 = (i+j)/2;
            int mid2 = mid1+1;
            if(nums[mid1]<nums[mid2]){
                i = mid2;
            }else j = mid1;
            
        }
        return i;
    }
}
