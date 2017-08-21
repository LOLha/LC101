public class S17 {
   int[] total = new int[]{0,0,3,3,3,3,3,4,3,4};
	    List<String> list = new ArrayList<String>();
	    String[] c = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	    public List<String> letterCombinations(String digits) {
            if(digits.length()==0) return list;
	        int[] number = new int[digits.length()];
	        for(int i=  0;i<number.length;i++){
	            number[i] = digits.charAt(i)-48;
	        }
	        int[] answer = new int[digits.length()];
	       recursiveSearch(number, answer, 0, digits.length());
	        
	      return list;
	    }
	    public void recursiveSearch(int[] number,int[] answer,int index,int n){
	        if(index==n){
	            String s = "";
	            for(int i = 0;i<n;i++){
	                s += c[number[i]].charAt(answer[i]);  
	            }
	            list.add(s);
	            return;
	        }
	        for(answer[index]=0;answer[index]<total[number[index]];answer[index]++){
	            recursiveSearch(number,answer,index+1,n);
	        }
	        
	    }
    
}
