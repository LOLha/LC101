public class S150{
	public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<Integer>();
        int n = tokens.length;
        for(int i = 0;i<n;i++){
            String tk = tokens[i];
            if(isOper(tk)){
                int a = s.pop();
                int b = s.pop();
                int c = 0;
                switch(tk){
                    case "+": c = a+b; break;
                    case "-": c = b - a; break;
                    case "*": c = a * b; break;
                    case "/": c = b /a; break;
                        
                }
                s.push(c);
            }
            else s.push(Integer.parseInt(tk));
        }
        return s.pop();
        
        
    }
    public boolean isOper(String t){
        if(t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/")) return true;
        return false;
    }
	
	
}