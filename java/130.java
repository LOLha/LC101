public class S130{
    public void solve(char[][] board) {
        int m = board.length;
        if(m==0) return;
        int n = board[0].length;
        Queue<Point> queue = new LinkedList<Point>();
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
               if((i==0||j==0||i==m-1||j==n-1)&&board[i][j]=='O'){
                      //board[i][j] = 'a';
                   queue.offer(new Point(i,j));   
            	   board[i][j] = 'a';
                   while(!queue.isEmpty()){
            		   Point p = queue.poll();
                	   int x = p.x;
                	   int y = p.y;
                       if(check(board, x+1, y)) {
                    	  queue.offer(new Point(x+1,y));
                    	  board[x+1][y] = 'a';  
                       }                	   
                       if(check(board, x-1, y)) {
                     	  queue.offer(new Point(x-1,y));
                     	  board[x-1][y] = 'a';  
                       }  
                       if(check(board, x, y+1)) {
                      	  queue.offer(new Point(x,y+1));
                      	  board[x][y+1] = 'a';  
                       }  
                       if(check(board, x, y-1)) {
                       	  queue.offer(new Point(x,y-1));
                       	  board[x][y-1] = 'a';  
                       } 
                	   
            		   
            	   }
            	   
               }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(board[i][j]=='a'){
                    board[i][j] = 'O';
                }else if(board[i][j]=='O'){
                    board[i][j] = 'X';
                }            
            }
        }    
    
    }
	public boolean check(char[][] board,int x,int y){
		if(x<0||y<0||x>=board.length||y>=board[x].length) return false;
		if(board[x][y]=='a'||board[x][y]=='X') return false;
		return true;
	}

}
