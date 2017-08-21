public class S79 {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        if(m==0) return false;
        int n = board[0].length;
        char[] s = word.toCharArray();
        
       for(int i = 0;i<m;i++){
           for(int j = 0;j<n;j++){
               if(dfs(board,i,j,s,0)) return true;
           }
           
       }
        return false;
    }
    public boolean dfs(char[][] board,int x,int y,char[] s,int start){
        if(start==s.length) return true;
        if(x<0||x>=board.length||y<0||y>=board[x].length) return false;
        if(board[x][y]!=s[start]) return false;
        board[x][y] ^= 255;
        boolean exist = dfs(board,x+1,y,s,start+1)||dfs(board,x-1,y,s,start+1)||dfs(board,x,y+1,s,start+1)||dfs(board,x,y-1,s,start+1);
        board[x][y] ^=255 ;
        return exist;
    }
    
    
}
