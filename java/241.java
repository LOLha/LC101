public class S241 {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> list = new ArrayList<Integer>();
        boolean isOper = false;
        for(int i = 0;i<input.length();i++){
            char c = input.charAt(i);
            if(c=='+'||c=='-'||c=='*'){
                isOper = true;
                List<Integer> left = diffWaysToCompute(input.substring(0,i));
                List<Integer> right = diffWaysToCompute(input.substring(i+1));
                for(Integer l:left){
                    for(Integer r:right){
                        switch(c){
                            case '+':
                                list.add(l+r);
                                break;
                            case '-':
                                list.add(l-r);
                                break;
                            case '*':
                                list.add(l*r);
                                break;
                        }   
                        
                    }
                }
            }
            
            
        }
        if(!isOper){
            list.add(Integer.parseInt(input));
        }
        return list;
    }
}
