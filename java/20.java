import java.util.Stack;


public class S20 {
	
	 public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<Character>();
	        char c;
	        for(int i = 0;i<s.length();i++){
	    	     c = s.charAt(i);
	    		 switch(c){
	    		 case ')':  if(!stack.empty()&&stack.pop()=='(') continue; else return false;
	    		 case '}':  if(!stack.empty()&&stack.pop()=='{') continue; else return false;
	    		 case ']':  if(!stack.empty()&&stack.pop()=='[') continue; else return false;
	    		 }
	    		stack.push(c);
	    	}
	        return stack.empty();
	    }

}
