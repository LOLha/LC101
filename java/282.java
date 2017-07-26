public class S282 {
    List<String> res = new ArrayList<String>();
    
    public List<String> addOperators(String num, int target) {
        if(num==null||num.length()==0){
            return res;
        }
        backtrace("",num,target,0,0,0);
        return res;
    }
    public void backtrace(String s,String num,int target,int pos,long eval,long mul){
        if(pos==num.length()){
            if(target==eval){
                res.add(s);
            }
            return;
        }
        for(int i = pos;i<num.length();i++){
            if(i!=pos&&num.charAt(pos)=='0') break;
            long cur = Long.parseLong(num.substring(pos,i+1));
            if(pos==0){
                backtrace(s+cur,num,target,i+1,eval+cur,cur);
            }else{
                backtrace(s+"-"+cur,num,target,i+1,eval-cur,-cur);
                backtrace(s+"+"+cur,num,target,i+1,eval+cur,cur);
                backtrace(s+"*"+cur,num,target,i+1,eval-mul+mul*cur,mul*cur);
            }
        }
    }
    
}
