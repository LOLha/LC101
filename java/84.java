public class S84{
	public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] l = new int[n];
        int[] r = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0;i<n;i++){
            for(;!stack.empty()&&heights[i]<=heights[stack.peek()];stack.pop());
            l[i] = stack.empty()?0:stack.peek()+1;
            stack.push(i);
             
        }
        stack.clear();
        for(int i = n-1;i>=0;i--){
            for(;!stack.empty()&&heights[i]<=heights[stack.peek()];stack.pop());
            r[i] = stack.empty()?n-1:stack.peek()-1;
            stack.push(i);
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            ans = Math.max(ans,heights[i]*(r[i] - l[i]+1));
        }
        return ans;
    }
}