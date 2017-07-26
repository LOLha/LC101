public class S240{
     public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length-1;
        if(m==-1) return false;
        int n = matrix[0].length;
        int i=0;
        while(m>=0&&i<n){
            if(matrix[m][i]>target){
                m--;
            }else if(matrix[m][i]<target){
                i++;
            }else{
                return true;
            }
            
        }
        return false;
        
        
    }

}
