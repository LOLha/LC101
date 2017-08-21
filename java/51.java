public class S51 {
    public List<List<String>> sum = new ArrayList<List<String>>();
    
    public List<List<String>> solveNQueens(int n) {
        int[] c = new int[n];    
        
        search(0,n,c);
        return sum;   
    }
    public void search(int cur,int n,int[] c){
        if(cur==n){
            add(c);
        }else{
           for(int i = 0;i<n;i++){
              boolean ok = true;
              c[cur] = i;
              for(int j=0;j<cur;j++){
                  if(c[cur]==c[j]||cur - c[cur]==j-c[j]||cur+c[cur]==j+c[j]){
                      ok = false;
                      break;
                  }
              }
              if(ok){search(cur+1,n,c);}
           }
        }
    }
    public void add(int[] c){
        List<String> list = new ArrayList<String>();
        String s = "";
        for(int i = 0;i<c.length;i++){
            s += '.';
        }
        for(int i = 0;i<c.length;i++){
            StringBuffer sb = new StringBuffer(s);
            int c1 = c[i];
            sb.setCharAt(c1,'Q');
            list.add(sb.toString());
        }
        sum.add(list);
        
    }
    
}
