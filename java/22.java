public class S22 {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        String s ="";
        generate(list,s,0,0,n);
        return list;
    }
    public void generate(List<String> list,String s,int open,int close,int n){
        if(s.length()==2*n){
            list.add(s);
            return;
        }
        if(open<n){
            generate(list,s+"(",open+1,close,n);
        }
        if(open>close){
            generate(list,s+")",open,close+1,n);
        }
    }
    
}
