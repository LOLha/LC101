public class S77{
    List<List<Integer>> sum = new ArrayList<List<Integer>>();
    public List<List<Integer>> combine(int n, int k) {
          int[] result = new int[k];
          boolean[] used = new boolean[n+1];
          make(0,result,used,n,1);
        
         return sum;
     
        
    }
    public void make(int level,int[] result,boolean[] used,int n,int start){
        
        for(int i = start;i<=n;i++){
            if(!used[i]&&level<result.length){
                used[i] = true;
                result[level] = i;
                make(level+1,result,used,n,i+1);
                used[i] = false;
            }
        }
          if(level==result.length){
            List<Integer> list = new ArrayList<Integer>();
            for(int i = 0;i<result.length;i++){
                list.add(result[i]);
            }
            sum.add(list);
            return;
        }
   
    }
    

}
