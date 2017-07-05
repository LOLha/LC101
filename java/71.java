public class S71{
	public String simplifyPath(String path) {
        String[] pathA = path.split("/");
        int n = pathA.length;
        Stack<String> stack = new Stack<String>();
        String res = "";
        for(int i = 0;i<n;i++){
            if(pathA[i].equals("")||pathA[i].equals(".")) continue;
            if(pathA[i].equals("..")){
              if(!stack.empty()){
                  stack.pop();
              }
            }else stack.push(pathA[i]);
        }
        if(stack.empty()){
            return "/";
        }
        while(!stack.empty()){
            res = "/"+stack.pop()+res;
        }
        return res;
    }
	
	
}